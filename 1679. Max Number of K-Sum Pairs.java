class Solution {
    public int maxOperations(int[] nums, int k) {
        int l=0,r=nums.length-1,count=0;
        Arrays.sort(nums);
        while(l<r)
        {
            if(nums[l]+nums[r]==k){
            count++;
            l++;
            r--;
            }
            else if(nums[l]+nums[r]<k)
            l++;
          
            
            else
            r--;
        }
        return count;
    }
}