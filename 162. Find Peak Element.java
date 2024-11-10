class Solution {
    public int findPeakElement(int[] nums) {
         int st=0;
        int sp=nums.length - 1;
        while(st<sp)
        {
          int  mid=st+(sp-st)/2;
            if(nums[mid]>nums[mid+1])
             sp=mid;
             else
                 st=mid+1;
                  
         }
        
        return st;
    }
}
