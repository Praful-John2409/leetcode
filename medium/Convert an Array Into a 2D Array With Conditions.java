// QYou are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:
// The 2D array should contain only the elements of the array nums.
// Each row in the 2D array contains distinct integers.
// The number of rows in the 2D array should be minimal.
// Return the resulting array. If there are multiple answers, return any of them.
// Note that the 2D array can have a different number of elements on each row.
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
      HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
      for(int i:nums){
          hm.put(i,hm.getOrDefault(i,0)+1);
      }
      int Max=0;
      for(Integer val:hm.values()){
          Max=Math.max(Max,val);
      }
      List<List<Integer>> ans=new ArrayList<List<Integer>>();
      while(Max>0){
          List<Integer> ans1=new ArrayList<>();
          for(Map.Entry<Integer,Integer> m: hm.entrySet()){
              if(m.getValue()!=0){
                  ans1.add(m.getKey());
                  m.setValue(m.getValue()-1);
              }
          }
          ans.add(ans1);
          Max--;
      }
      return ans;
    }
}
