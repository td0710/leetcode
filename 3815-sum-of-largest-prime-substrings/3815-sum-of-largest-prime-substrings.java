class Solution {
    public long sumOfLargestPrimes(String s) {
        Set<Long> set = new HashSet<>() ; 

        int n = s.length() ; 

        for(int i = 0; i < s.length(); i++) {
            long tmp = 0;
            for(int j = i; j < s.length(); j++) {
                tmp = tmp * 10 + (s.charAt(j) - '0') ; 
                if(isPrime(tmp)) set.add(tmp) ; 
            }
        }

        List<Long> prime = new ArrayList<>(set) ; 
        prime.sort(null);

        int m = prime.size();

        if (m < 3) {
            long sum = 0;
            for (long p : prime) sum += p;
            return sum;
        }

        return prime.get(m - 1) + prime.get(m - 2) + prime.get(m - 3);
    }
    private boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; ++i)
            if (n % i == 0) return false;
        return true;
    }
}