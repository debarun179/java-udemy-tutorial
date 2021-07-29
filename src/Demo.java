/*
Given the array of integer nums, you will choose two different indices
i and j of that array.Return the maximum value of (nums[i]-1)*(nums[j]-1)
{1,3,5,25,4,1,0,4,-10,-11,-11} {-11,-11,-10,-10,0,1,1,3,4,4,5,25}
max = 0;
i=0;i<arr.length
j=1 to arr.length
if (max > (a[i]-1)*(a[j]-1))
i++;j--
max =0;
max=72;

 */

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int [] a = {1,3,5,25,4,1,0,4,-10,-11,-11};
        int max = findMax(a);
        System.out.println("max: "+max);
    }
    public static int findMax(int[] a){
        int max = 0;
        Arrays.sort(a);
        if (a[a.length-1]>0 && a[a.length-2]>0){
            max = (a[a.length-1]-1)*(a[a.length-2]-1);
        } else if (a[0]<0 && a[1]<0){
            max = (a[0]-1)*(a[1]-1);
        }
        return max;
    }

}
