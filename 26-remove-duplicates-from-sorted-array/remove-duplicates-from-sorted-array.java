class Solution {
    public int removeDuplicates(int[] nums) {
        int pos=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                pos++;
                nums[pos]=nums[i];
            }
        }
        return pos+1;
    }
}