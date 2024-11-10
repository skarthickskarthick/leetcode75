class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            arr[i]=func(i);
        }
        return arr;
    }
    static int func(int n)
    {
        int c=0;
        while(n!=0)
        {
            c+=n&1;
            n=n>>1;
        }
        return c;
    }
    
}
