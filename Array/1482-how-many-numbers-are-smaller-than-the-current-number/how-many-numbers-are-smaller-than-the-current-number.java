//How many numbers are smaller than the current number
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i]=count;
            count=0;
        }
        return ans;
    }
}