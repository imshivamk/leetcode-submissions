class Solution {
        // [0,0,2,4 ]
       public int[] productExceptSelf(int[] nums) {
            
            int n = nums.length;
            int[] result = new int[n];
    
            // Product of everything to the LEFT
            int left = 1; // val will be 1 for first from left
    
            for (int i = 0; i < n; i++) {
                result[i] = left;
                left *= nums[i];
            }
    
            // Product of everything to the RIGHT
            int right = 1; // because for the first from the right, its val will be 1
    
            for (int i = n - 1; i >= 0; i--) {
                result[i] *= right;
                right *= nums[i];
            }
     
            return result;
        }
    }