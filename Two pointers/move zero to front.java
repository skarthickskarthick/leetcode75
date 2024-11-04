

import java.util.Arrays;

public class move_zeros_to_front {
    public static void main(String args[])
    {
        int arr[]={1,0,2,3,0,0,4,5,6,0,0};

        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0&&key==0&&arr[j]!=0)
            {
                arr[j+1]=arr[j];
                j--;
            }

           arr[j+1]=key;
            System.out.println(Arrays.toString(arr));

        }

    }
}
