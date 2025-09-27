class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>() ; 

        for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        int res = 0,check = 0  ; 
        for (Integer v : map.values()) {
            if (v%2==0) res+=v ; 
            else { 
                check++ ; 
                res+=v-1 ; 
            } 
        }
        if(check>0) return res+1 ; 
        else return res ; 
    }
} 