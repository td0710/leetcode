class Solution {
int[][] dp;
    public int maxValue(int[][] arr, int k) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        int n = arr.length;
        dp = new int[n][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(arr, 0, k, 0);
    }

    private int solve(int arr[][], int i, int k, int start) {
        if(i == arr.length) return 0 ; 

        if(k == 0) return 0 ; 

        if (arr[i][0] <= start) return solve(arr, i + 1, k, start);

        if (dp[i][k] != -1) return dp[i][k] ; 

        int yes = arr[i][2] + solve(arr, i + 1, k - 1, arr[i][1]) ; 
        int no =  solve(arr, i + 1, k, start) ; 

        return dp[i][k] = Math.max(yes, no) ; 
    }
}