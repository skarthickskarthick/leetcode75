class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    // similar to split array largest sum
    int start=1,stop=0;
    for(int i=0;i<piles.length;i++)
    {
        if(stop<piles[i])
        stop=piles[i];
    }
    while(start<=stop)
    {
    int mid=start+(stop-start)/2;//mid is the possible set of hpurs
    int totalh=calculate(piles,mid);
    if(totalh>h)
    start=mid+1;
    else
    stop=mid-1;
    }
    return start;
    }
    static int calculate(int[] piles,int mid)
    {
        int totalh=0;
        for(int i=0;i<piles.length;i++)
        {
            totalh+=Math.ceil((double)piles[i]/(double)mid); //double type is important
        }
        return totalh;
    }
}


