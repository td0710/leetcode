class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;

        List<Integer> arr = new ArrayList<>() ; 

        arr.add(startTime[0]) ; 
        for (int i = 1; i < n; i++) {
            arr.add(startTime[i] - endTime[i-1]) ;
        }
        arr.add(eventTime - endTime[n -1]);

        int windowSum = 0;
        for(int i = 0; i < k + 1; i++) windowSum += arr.get(i) ; 

        int res = windowSum;
        for (int i = k + 1; i < arr.size(); i++) {
            windowSum += arr.get(i) - arr.get(i - (k+1)) ; 
            res = Math.max(res, windowSum) ; 
        }

        return res ;
    }
}