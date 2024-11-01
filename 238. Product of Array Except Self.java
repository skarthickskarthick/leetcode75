class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1,zeroindex=-1,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            prod*=nums[i];
            else
            {
            zeroindex=i;
            count++;
            }
        }
        
        int arr[]=new int[nums.length];
        if(count>1)
        return arr;
        for(int i=0;i<nums.length;i++)
        {
            if(i<zeroindex)
            arr[i]=0;
            else if(i==zeroindex)
            arr[i]=prod;
            else if(zeroindex==-1)
            arr[i]=prod/nums[i];
            else
            arr[i]=0;
        }
        return arr;
    }
}