1)2390. Removing Stars From a String

class Solution {
    public String removeStars(String s) {
        String str="";
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if(ch!='*')
           {   
               str+=String.valueOf(ch);

           }
           else
           {
               str=str.substring(0,str.length()-1);
           }
        }
        return str;
    }
}