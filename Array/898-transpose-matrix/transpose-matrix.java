//Transpose Matrix
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;//rows
        int n=matrix[0].length;//columns
        int[][] tmatrix=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                tmatrix[j][i]=matrix[i][j];
            }
        }
        return tmatrix;
    }
}