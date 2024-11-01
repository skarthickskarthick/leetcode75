class Solution {
    public String reverseWords(String s) {
        String ans="",temp="";
        s.trim();
        int flag=0;
        s=" "+s;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' '&&flag==1)
            {
               flag=0;
               temp=reverse(temp);
                ans+=temp+" ";
                temp="";

            }
            else if(s.charAt(i)!=' '){

            temp+=s.charAt(i);
            flag=1;
            }
        }
        return ans.trim();
    }
    static String reverse(String s)
    {
        char c[]=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r)
        {
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
        return new String(c);
    }
}