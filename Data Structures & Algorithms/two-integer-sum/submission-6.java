class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] res = {-1,-1};
        Map<Integer, Integer> map = new HashMap<>();
        // map ~ {num : index}
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                res[0] = map.get(complement);
                res[1] = i;
            }
            map.put(nums[i], i);
        }

        return res;
    }
}
