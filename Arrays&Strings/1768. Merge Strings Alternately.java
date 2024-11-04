class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        char w1[]=word1.toCharArray();
        char w2[]=word2.toCharArray();
        int n=0;
        if(word1.length()<word2.length())
        n=word2.length();
        else
        n=word1.length();
        for(int i=0;i<n;i++)
        
        {
           if(i<word1.length())
           ans+=w1[i];
           if(i<word2.length())
           ans+=w2[i];
        }
        return ans;
    }
}