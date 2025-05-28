//Shuffle the Array
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int a=0;
        for(int i=0;i<n;i++){
            ans[a++]=nums[i];
            ans[a++]= nums[i+n];
        }
        return ans;
    }
}