function possibleStringCount(word: string): number {
  let count = 1 ; 
  let res = 1 ; 
  for(let i = 1; i < word.length; i++) {
    if(word[i] != word[i-1]) {
        if(count > 1) {
            res += count - 1 ; 
        }
        count = 1 ;
    }
    else count++; 
  }
  return res = count > 1 ? res + count -1 : res; 
};