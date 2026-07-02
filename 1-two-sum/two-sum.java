class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int increment=0;
        for(int i=0;i<nums.length;i++){
            increment=target-nums[i];
            if(map.containsKey(increment)){
                return new int[]{map.get(increment),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int []{};
    }
}