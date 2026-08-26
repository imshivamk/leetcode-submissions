class Solution {
        public int[] topKFrequent(int[] nums, int k) {

        int res[] = new int[k];
        Map<Integer, Integer> fMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(fMap.containsKey(nums[i])){
                fMap.put(nums[i], fMap.get(nums[i])+1);
            } else {
                fMap.put(nums[i], 1);
            }
        }

        ArrayList<Integer> keys = new ArrayList<>(fMap.keySet());
        keys.sort((a,b) -> fMap.get(b) - fMap.get(a));

        System.out.println(keys);
        
        for (int i = 0; i < k; i++) {
            res[i] = keys.get(i);
        }
        
        return res; 
    }

}
