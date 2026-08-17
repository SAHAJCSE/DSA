class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=nums[0];
        int csum=0;
        for(int i:nums){
            csum+=i;
            if(csum>maxi){
                maxi=csum;
            }
            if(csum<0){
                csum=0;
            }
        }
        return maxi;
    }
}