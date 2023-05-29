// Q)You are given a positive integer array nums.
// The element sum is the sum of all the elements in nums.
// The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
// Return the absolute difference between the element sum and digit sum of nums.
// Note that the absolute difference between two integers x and y is defined as |x - y|.
class Solution {
    public int differenceOfSum(int[] nums) {
        int x=0,y=0;
        for(int val:nums){
            x+=val;
            if(val>9){
                int a=val,sum=0;
                while(a!=0){
                    int r=a%10;
                    sum+=r;
                    a/=10;
                }
                y+=sum;
            }else{
                y+=val;
            }
        }
        return Math.abs(x-y);
    }
}
