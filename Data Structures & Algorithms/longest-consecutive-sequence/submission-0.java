class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        
        int longestSeqLength = 0;

        for(int num: nums){
            if(!set.contains(num-1)){
                // if set doesnt contain the number left to our num on the number line
                // it is the start of the sequence
                int len = 0;
                while(set.contains(num+len)){
                    len++;
                }
                longestSeqLength = Math.max(len, longestSeqLength);
            }
        }

        return longestSeqLength;
    }
}
