function ladderLength(beginWord: string, endWord: string, wordList: string[]): number {
    const set = new Set<string>(); 

    wordList.map((x) => set.add(x)) ; 

    if(!set.has(endWord)) return 0 ; 


    const q = [] ; 

    q.push([beginWord , 1]) ;

    while(q.length !== 0) {
        const [word, steps] = q.shift()!;

        if (word == endWord) return steps;

        
        for(let i = 0; i < word.length; i++) {
            let tmp = word ;
            for(let c = 97; c <= 122; c++) {
                const char = String.fromCharCode(c);

                const newWord = word.slice(0, i) + char + word.slice(i + 1);
               if (set.has(newWord)) {
                    set.delete(newWord);
                    q.push([newWord, steps + 1]);
                }
            } 
        }  
    } 
    return 0 ;
};