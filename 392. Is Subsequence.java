class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0,r=0;
        while(r<t.length()&&l<s.length())
        {
           if(t.charAt(r)==s.charAt(l)){
            
            l++;
           }
           r++;
           

        }
        if(l==s.length())
        return true;
        return false;
    }
}
