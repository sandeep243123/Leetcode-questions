class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],me=nums[0];
        for(int i=1;i<nums.length;i++){
            me=Math.max(me+nums[i],nums[i]);
            sum=Math.max(sum,me);
        }
        return sum;    
    }
}