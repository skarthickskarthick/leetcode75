class Solution {
    public int equalPairs(int[][] grid) {
        int tgrid[][]=new int[grid.length][grid.length];
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            
            for(int j=0;j<grid[0].length;j++)
            {
                tgrid[i][j]=grid[j][i];
                
            }
        }

        for(int i=0;i<grid.length;i++)
        {
            
            for(int j=0;j<grid[0].length;j++)
            {
               if(check(grid[i],tgrid[j]))
               c++;
                
            }
        }

        return c;
    }
    public static boolean check(int[] a,int[] b)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
            return false;

        }
        return true;
    }
}

