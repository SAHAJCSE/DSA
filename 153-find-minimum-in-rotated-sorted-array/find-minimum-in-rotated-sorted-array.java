class Solution {
    public int findMin(int[] nums) {
        int x=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<x){
                x=nums[i];
            }
        }
        return x;
    }
}