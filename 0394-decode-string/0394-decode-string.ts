function decodeString(s: string): string {
    const numStack: number[] = [];
    const stack: string[] = [];

    for (let i = 0; i < s.length; i++) {
        let cnt = 0;

        
        if (s[i].charCodeAt(0) >= 48 && s[i].charCodeAt(0) <= 57) {
            while (s[i].charCodeAt(0) >= 48 && s[i].charCodeAt(0) <= 57) {
                cnt = cnt * 10 + (s[i].charCodeAt(0) - 48);
                i++;
            }
            i--;
            numStack.push(cnt);
        }

        
        else if (s[i] === ']') {
            let tmp = "";
            while (stack.length && stack[stack.length - 1] !== '[') {
                tmp = stack.pop()! + tmp;
            }

            stack.pop(); 
            const repeat = numStack.pop()!;

            let expanded = "";
            for (let j = 0; j < repeat; j++) {
                expanded += tmp;
            }

            
            for (const ch of expanded) {
                stack.push(ch);
            }
        }

        
        else {
            stack.push(s[i]);
        }
    }

   
    return stack.join('');
};