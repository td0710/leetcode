class Solution {
    public long calculateScore(String[] s, int[] values) {
        Map<Integer,Integer> map = new HashMap<>() ; 

        int i = 0; 
        long res = 0;

        while (i < values.length) {
            if (map.containsKey(i) || i < 0 ) break ; 

            map.put(i, 0); 

            if (s[i].equals("jump")) { 
                i += values[i] ; 
            } 
            else {
                res += values[i] ; 
                i++ ; 
            }
        }
        return res ; 
    }
}