function minDeletion(s: string, k: number): number {
    const map = new Map() ; 
    [...s].map((x) => map.set(x, (map.get(x) || 0) + 1)) ; 

    const arr = new Array() ; 

    for (const [key,value] of map) {
        arr.push(value) ; 
    }

    arr.sort((a,b) => a - b) ; 

    let res = 0; 

    for (let i = 0; i < map.size - k; i++) {
        res += arr[i] ; 
    }

    return res ; 
};