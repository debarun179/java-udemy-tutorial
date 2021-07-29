public class QuickSort {
    public static void main(String[] args) {
        int[] a = {7,6,10,5,9,2,1,15,7};
        int start = 0;
        int end = a.length-1;
        quicksort(a,start,end);
        for (int k=0;k<a.length;k++)
            System.out.println(a[k]);
    }
    public static void quicksort(int[]a,int start,int end) {

        int loc;
        if (start<end) {
            loc = partition(a, start, end);
            quicksort(a,start,loc-1);
            quicksort(a,loc+1,end);
        }
    }
    public static int partition(int[] a,int start, int end){
        int pivot = a[(start+end)/2];
//        System.out.println("Pivot to start: "+pivot);
        int temp;
        while (start<=end){
            while (a[start] < pivot) {
                start++;
//                System.out.println("Start: "+start);
            }
            while (a[end] > pivot) {
                end--;
//                System.out.println("End: "+end);
            }
            if(start<=end) {
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
//            System.out.println("a start: "+a[start]+" "+start+" and End: "+a[end]+" "+end);
        }
        return start;
    }

    public static void swap(int i, int j){
        int temp;
        temp = i;
        i=j;
        j=temp;
    }
}
