// Q)Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. 
// Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<arr2.length;i++){
            al.add(arr2[i]);
            int found=0;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j] && found++>=1){
                    al.add(arr1[j]);
                }
            }
        }
        List<Integer> subal=new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++){
            if(!al.contains(arr1[i])){
                subal.add(arr1[i]);
            }
        }
        Collections.sort(subal);
        al.addAll(subal);
        int []ans=new int[al.size()];
        for(int i=0;i<al.size();i++){
            ans[i]=al.get(i);
        }
        return ans;
    }
}
