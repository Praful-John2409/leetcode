//Q)Given an array of positive integers nums,
//return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.
// To separate the digits of an integer is to get all the digits it has in the same order.
// For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].
class Solution {
    public int[] separateDigits(int[] nums) {
        List <Integer>al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                al.add(nums[i]);
            }
            else{
                int num=nums[i];
                ArrayList <Integer>subal=new ArrayList<>();
                while(num!=0){
                    subal.add(num%10);
                    num/=10;
                }
                Collections.reverse(subal);
                al.addAll(subal);
            }
        }
        int [] ans =new int[al.size()];
        for(int i=0;i<al.size();i++){
            ans[i]=al.get(i);
        } 
        return ans;
    }
}
