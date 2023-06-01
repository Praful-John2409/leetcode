// Q)Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.
// The digit sum of a positive integer is the sum of all its digits

class Solution {
    public int countEven(int num) {
        int result=0;
        for(int i=1;i<=num;i++)
        {
            int n=i;
            int sum=0;
            while(n!=0)
            {
                sum+=n%10;
                n=n/10;
            }
          if(sum%2==0)
              result++;
        }
        return result;
    }
}
