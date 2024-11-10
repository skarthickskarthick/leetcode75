class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // to count  number of exact goal count subarrays
        return count(nums, goal) - count(nums, goal - 1);
    }

    int count(int[] nums, int goal) {
        int left = 0, sum = 0, count = 0;
         if(goal<0)
         return 0;
        // Iterate through the array using the right pointer
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];  // Add the current element to the sum
         
            // Shrink the window from the left if sum exceeds the goal
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }

            // counts the number of subarrays with sum less than or equal to goal
            count += right - left + 1;
        }
        
        return count;
    }
}
