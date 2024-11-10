class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        while(c!=0||a!=0||b!=0)
        {
            if((c&1)==1)
            {
                if((a&1)==0&&(b&1)==0){
                count++;
                  System.out.println(count);}
               
            }
            else
            {
                if((a&1)==1)
                {
                    count++;
                    if((b&1)==1)
                    count++;
                   
                }
               else  if((b&1)==1)
                 count++;
                   

            }
            c=c>>1;
            a=a>>1;
            b=b>>1;
        }
        return count;
    }
}

