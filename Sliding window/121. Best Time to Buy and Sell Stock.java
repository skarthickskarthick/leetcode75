class Solution {
    public int maxProfit(int[] prices) {
        int min=10000,res=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            min=prices[i];
            if(res<prices[i]-min)
            res=prices[i]-min;
        }
        return res;
    }
}

