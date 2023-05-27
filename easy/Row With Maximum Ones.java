//Q) Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.

// In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.

// Return an array containing the index of the row, and the number of ones in it.

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rowCnt=0,oneCnt=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(oneCnt<count){
                oneCnt=count;
                rowCnt=i;
            }
        }
        return new int[] {rowCnt,oneCnt};
    }
}
