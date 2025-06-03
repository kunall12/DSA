//Cells with Odd Values in a Matrix
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans=new int[m][n];
        int count=0;
        for(int i=0;i<indices.length;i++){
            //for row 
            for(int j=0;j<n;j++){
                ans[indices[i][0]][j]++;
            }
            //for column
            for(int j=0;j<m;j++){
                ans[j][indices[i][1]]++;
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                if(ans[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}