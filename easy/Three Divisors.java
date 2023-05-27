//Q) Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
An integer m is a divisor of n if there exists an integer k such that n = k * m.
class Solution {
    public boolean isThree(int n) {
        int i=2,count=2;
        while(i<=n/2){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==3)
            return true;
        return false;
    }
}
