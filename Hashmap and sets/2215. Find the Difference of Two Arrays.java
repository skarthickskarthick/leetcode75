class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
      for(int i=0;i<nums1.length;i++)
      {
        while(i<nums1.length-1&&nums1[i]==nums1[i+1]){
        i++;
       
        }
        
        if(!search(nums2,nums1[i]))
        
        list1.add(nums1[i]);
      }
      ans.add(list1);

      
       for(int i=0;i<nums2.length;i++)
      {
        while(i<nums2.length-1&&nums2[i]==nums2[i+1]){
        i++;
       
        }
        if(!search(nums1,nums2[i]))
        
        list2.add(nums2[i]);
      }
      

  ans.add(list2);


        return ans;

    }

    public static boolean search(int nums[],int key)
    {
        int start=0,stop=nums.length-1;
        while(start<=stop)
        {
            int mid=start+(stop-start)/2;
            
            if(nums[mid]==key)
            return true;
            else if (nums[mid]< key)
            start=mid+1;
            else
            stop=mid-1;
        }
        return false;
    }
}
