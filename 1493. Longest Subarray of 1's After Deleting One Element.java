class Solution {
    public int longestSubarray(int[] nums) {
           int l=0,r=0,count=0,max=0;
        while(r<nums.length)
        {
            if(nums[r]==0)
            count++;
            while(count>1&&l<=r)
            {
                if(nums[l]==0)
                count--;
                l++;
            }
            max=Math.max(max,r-l);
            r++;
        }
        return max;
    }
}
