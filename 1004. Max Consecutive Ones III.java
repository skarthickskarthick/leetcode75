class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,count=0,max=0;
        while(r<nums.length)
        {
            if(nums[r]==0)
            count++;
            while(count>k)
            {
                if(nums[l]==0)
                count--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
