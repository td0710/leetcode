class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        

        if (dividend == divisor) return 1;

        boolean isPositive = (dividend < 0 == divisor < 0) ;
        
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        Integer res = 0 ;

        while (a >= b) {
            Integer q = 0 ;
            while(a > (b<<(q + 1))) q++ ;

            res += (1<<q) ;  
            a = a - (b<<q) ; 
        }

        if(res == (1<<31) && isPositive) return Integer.MAX_VALUE ; 

        return isPositive ? res : -res ; 
    }
}