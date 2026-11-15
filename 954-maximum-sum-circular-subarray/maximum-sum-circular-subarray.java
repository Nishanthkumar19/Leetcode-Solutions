class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max_cur_sum=nums[0];
        int max_sum=nums[0];
        int min_cur_sum=nums[0];
        int min_sum=min_cur_sum;

        int total=nums[0];
        for(int i=1;i<nums.length;i++){
            total+=nums[i];
            max_cur_sum=Math.max(max_cur_sum+nums[i],nums[i]);
            max_sum=Math.max(max_sum,max_cur_sum);
            min_cur_sum=Math.min(min_cur_sum+nums[i],nums[i]);
            min_sum=Math.min(min_sum,min_cur_sum);
        }
        if(max_sum<0){
            return max_sum;
        }
        return Math.max(max_sum,total-min_sum);
    }
}