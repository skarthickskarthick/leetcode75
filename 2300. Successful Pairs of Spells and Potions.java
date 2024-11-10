import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];
        
        // Sort the potions array to allow binary search
        Arrays.sort(potions);
        
        // For each spell, we need to find how many potions are successful
        for (int i = 0; i < n; i++) {
            long target = (success + spells[i] - 1) / spells[i];  // To ensure correct rounding up that is to find the ceil value while division

            // Perform binary search to find the first potion that satisfies the condition
            int low = 0, high = m - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (potions[mid] >= target) {
                    high = mid - 1;  // Move high to mid - 1 to find the first valid potion
                } else {
                    low = mid + 1;  // Otherwise, look to the right
                }
            }
            
            // The number of successful potions is all potions from 'low' to the end
            ans[i] = m - low;  // Correct count of successful potions
        }
        
        return ans;
    }
}

