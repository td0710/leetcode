class Solution {
    public int reverseDegree(String s) {
        Map<Integer,Integer> map = new HashMap<>() ; 

        int val = 26 ; 
        for (int i = 0; i < 26; i++) {
            map.put(i, val) ;
            val-- ; 
        }

        int res = 0 ; 
        for(int i = 0; i < s.length(); i++) {
            res += (map.get(s.charAt(i) - 'a') * (i + 1)) ; 
        }
        return res ;
    }
}