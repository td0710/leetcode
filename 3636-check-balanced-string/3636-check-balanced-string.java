class Solution {
    public boolean isBalanced(String num) {
        int even = 0 , odd = 0 ; 

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            int digit = ch - '0';
            
            if (i % 2 == 0)
                even += digit;
            else odd += digit;
        }
        return even == odd ; 
    }
}