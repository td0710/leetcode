class Solution {
    public int maxFreqSum(String s) {
        String vowels = new String("aeiou") ; 

        int maxv = 0, maxc = 0 ;


        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains("" + s.charAt(i))) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1) ;

                maxv = Math.max(maxv, map.get(s.charAt(i))) ; 
            }

            else {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1) ;

                maxc = Math.max(maxc, map.get(s.charAt(i))) ; 
            }
        }
        return maxv + maxc ; 
    }
}