// QGiven an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        List<Integer> result= new ArrayList<Integer>();
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)) {
                result.add(i);
            } 
        }
        return result;
    }
}
