// Q)Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.
// The digit sum of a positive integer is the sum of all its digits.
class Solution {
    public int alternateDigitSum(int n) {
        //first appraoch 
        // List <Integer> al=new ArrayList<Integer>();
        // while(n!=0){
        //     al.add(n%10);
        //     n/=10;
        // }
        // Collections.reverse(al);
        // int sum=0;
        // System.out.println(al);
        // for(int i=0;i<al.size();i++){
        //     if(i%2==0){
        //         sum=sum+al.get(i);
        //     }
        //     else{
        //         sum=sum-al.get(i);
        //     }
        // }
        // return sum;
        //second approach
        String s=Integer.toString(n);
        int sum=0,f=0;
        for(int i=0;i<s.length();i++){
            if(f==0){
                sum+=s.charAt(i)-'0';
                f++;
            }
            else{
                sum-=s.charAt(i)-'0';
                f--;
            }
        }
        return sum;
    }
}
