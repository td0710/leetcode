function Equal(a: number[], b: number[]): boolean {
    if (a.length !== b.length) return false;
    for (let i = 0; i < a.length; i++) {
        if (a[i] !== b[i]) return false;
    }
    return true;
}
function findAnagrams(s: string, p: string): number[] {
    let s_len = s.length ;
    let p_len = p.length ;

    if (s_len < p_len) return [] ; 

    const dir = new Array(26).fill(0) ; 
    const arr = new Array(26).fill(0) ;

    for (let i = 0; i < p_len; i++) {
        dir[p.charCodeAt(i) - 97]++; 
        arr[s.charCodeAt(i) - 97]++; 
    } 

    const res = new Array() ; 
    if(Equal(arr,dir)) res.push(0) ; 

    for (let i = p_len; i < s_len; i++) {
        arr[s.charCodeAt(i-p_len) - 97]--;
        arr[s.charCodeAt(i) - 97]++;

        if(Equal(arr,dir)) res.push(i - p_len + 1) ; 
    }

    return res ; 
};