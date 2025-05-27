//Richest Customer Wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++ ){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            max=sum>max? sum:max;
            //ternary operator: var=condition ? true:false;
            //if(sum>max){
            //    max=sum;
            //}
        }
        return max;
    }
}