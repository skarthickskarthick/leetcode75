class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s =new Stack<>();
        if(asteroids.length!=0)
        s.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++)
        {
            if(!s.isEmpty()){
          if(s.peek()>0&&asteroids[i]>0)
          s.push(asteroids[i]);
          else if(s.peek()<0&&asteroids[i]<0)
          s.push(asteroids[i]);
        else  if(s.peek()>0&&asteroids[i]<0){
           if(Math.abs(asteroids[i])>s.peek()){
           s.pop();
           
         if(s.isEmpty()){
           s.push(asteroids[i]);
           continue;}
           i--;
           }
           else if(Math.abs(asteroids[i])==s.peek())
           s.pop();
          
           else
           continue;

        }
        else if(s.peek()<0&&asteroids[i]>0)
        s.push(asteroids[i]);
    
      
            }
            else if(i<=asteroids.length-1)
            s.push(asteroids[i]);
       
        }
        Integer[] arr=s.toArray(new Integer[s.size()]);
        int a[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        a[i]=arr[i];
        return a;
    }
}


