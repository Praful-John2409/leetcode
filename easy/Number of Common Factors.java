// Q)Given two positive integers a and b, return the number of common factors of a and b.
// An integer x is a common factor of a and b if x divides both a and b.
class Solution {
    public int commonFactors(int a, int b) {
        int x=2,count=1,i;
        if(a>b)
            i=b;
        else
            i=a;
        while(x<=i){
            if(a%x==0 && b%x==0)
                count++;
            x++;
        }
        return count;
    }
}
