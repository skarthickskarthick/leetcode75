class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> l=new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            max=candies[i];
            candies[i]=candies[i]+extraCandies;
            
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>=max)
            l.add(true);
            else
            l.add(false);

        }
        return l;
    }
}