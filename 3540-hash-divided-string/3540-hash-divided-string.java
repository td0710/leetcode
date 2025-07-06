class Solution {
    public String stringHash(String s, int k) {
        
        StringBuilder sb = new StringBuilder() ; 

        int cnt = 0, tmp = k ; 

        for(int i = 0; i < s.length(); i++) {
            if (tmp > 0) {
                cnt += s.charAt(i) - 'a' ; 
                tmp-- ; 
            }
            else {
                sb.append((char)((cnt % 26) + 'a')) ; 
                tmp = k - 1 ; 
                cnt = 0 ;
                cnt += s.charAt(i) - 'a' ; 

            }
        }
        sb.append((char)((cnt % 26) + 'a')) ; 

        return sb.toString() ;
    }
}