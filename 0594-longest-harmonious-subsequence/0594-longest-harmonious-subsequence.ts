function findLHS(nums: number[]): number {
    const map = new Map() ; 
    nums.map((item) => { 
        map.set(item, (map.get(item) || 0) + 1) ; 
    })

    let res = 0 ; 

    for (const [key, value] of map) {
        if (map.has(key + 1)) {
            res = Math.max(res, value + (map.get(key + 1) ?? 0));
        }
    }
    
    return res ; 
};