//Find the Highest Altitude
class Solution {
    public int largestAltitude(int[] gain) {
        int highalt=0;
        int curr=0;
        for(int i=0;i<gain.length;i++){
            curr=curr+gain[i];
            if(curr>highalt){
                highalt=curr;
            }
        }
        return highalt;
    }
}