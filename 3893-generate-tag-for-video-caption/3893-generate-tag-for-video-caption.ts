function generateTag(caption: string): string {
    const arr = caption.trim().split(/\s+/);

    
    let res = "#" + arr[0].toLowerCase() ; 

    for (let i = 1; i < arr.length; i++) {
        if (arr[i].length == 0) continue; 
        let first = arr[i][0].toUpperCase() ; 
        let rest = arr[i].slice(1,arr[i].length).toLowerCase() ; 
        res += first + rest; 
        if(res.length > 100) break ;
    }

    return res.slice(0, 100) ; 
};