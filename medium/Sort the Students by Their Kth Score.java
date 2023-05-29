// Q)There is a class with m students and n exams. You are given a 0-indexed m x n integer matrix score, 
// where each row represents one student and score[i][j] denotes the score the ith student got in the jth exam. 
// The matrix score contains distinct integers only.
// You are also given an integer k. Sort the students (i.e., the rows of the matrix) by their scores in the kth (0-indexed) 
// exam from the highest to the lowest.
// Return the matrix after sorting it.
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m=score.length,n=score[0].length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int arr[]=new int [m];
        int ind=0;
        for(int i=0;i<m;i++){
            hm.put(score[i][k],i);
            arr[ind++]=score[i][k];
        
        }
        Arrays.sort(arr);
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            int j=hm.get(arr[i]);
            ans[--ind]=score[j];
        }
        return ans;
    }
}
