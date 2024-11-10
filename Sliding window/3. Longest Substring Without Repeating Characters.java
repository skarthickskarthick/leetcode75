class Solution {
    public int lengthOfLongestSubstring(String s) {
      Set<Character> set=new HashSet<>();
        
        int l=0,r=0,length=0,max=0;
        char c[]=new char[26];
        while(r<s.length())
        {
           
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
             l++;   
            }
          set.add(s.charAt(r));
            length=r-l+1;
           max= Math.max(max,length);
           
            r++;
        }
        return max;
    }
}
