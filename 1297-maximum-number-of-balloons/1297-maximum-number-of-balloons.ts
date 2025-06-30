function maxNumberOfBalloons(text: string): number {
    
    const mp = new Map<string,number>() ; 

    [...text].map((item) => mp.set(item, (mp.get(item) || 0) + 1 )) ; 

    mp.set("l", Math.floor((mp.get("l") ?? 0) / 2));
    mp.set("o", Math.floor((mp.get("o") ?? 0) / 2));

    let res = 1e9 ; 

    for (const ch of "balon") { 
        res = Math.min(res, mp.get(ch) ?? 0);
    }

    return res ;
};