function decodeString(s: string): string {
    const numStack = [];
    const stack = [];

    let res = "" ;
    let tmp = "" ;

    for (let i = 0; i < s.length ;i++) {
        let cnt = 0 ; 

        if(s[i].charCodeAt(0) >= 48 && s[i].charCodeAt(0) <= 57) {
            while(s[i].charCodeAt(0) >= 48 && s[i].charCodeAt(0) <= 57) {
                cnt=cnt*10+s[i].charCodeAt(0) - 48;
                i++;
            }
            i--
            numStack.push(cnt) ; 
        }

        else if (s[i] == ']') {
            tmp="" ; 
            cnt=numStack[numStack.length - 1] ; 
            numStack.pop() ; 
            while(stack[stack.length - 1] != '[') {
                tmp = stack[stack.length - 1] + tmp ; 
                stack.pop() ; 
            }
            stack.pop() ; 
            for(let j=0;j<cnt;j++){
                res = res + tmp;
            }
             for(let j=0;j<res.length;j++){
                stack.push(res[j]);
            }
            res="";
        }
        else{
           stack.push(s[i]);
        }
    }
    return stack.join('');
};