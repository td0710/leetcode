class Solution {
    public char kthCharacter(long k, int[] operations) {
        int cnt = 0 ; 
        
        List<Long> arr = new ArrayList<>() ; 

        long len = 1; 

        while (len > 0) {
            len *= 2;
            arr.add(len) ; 
            if(len >= k) break ; 
        }

        for(int i = arr.size() - 1; i >= 0; i--) {
            long mid = arr.get(i) / 2 ; 

            if (k > mid) {
                k -= mid;
                if (operations[i] == 1) cnt++ ; 
            }
        }

        return (char) (((cnt) % 26) + 'a') ; 
    }
}