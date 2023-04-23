//Q) Given an integer x, return true if x is a palindrome, and false otherwise.
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int x1=x;
        int digit=0;
        while(x!=0){
            digit=digit*10+(x%10);
            x/=10;
        }
        if(x1==digit)
            return true;
        return false;
    }
}
