class Solution {
    public int removeDuplicates(int[] nums) {
        int prev=0;
        for(int curr=0;curr<nums.length;curr++){
            if(nums[curr]!=nums[prev]){
                prev++;
                nums[prev]=nums[curr];
            }
        }
        return prev+1;
    }
}