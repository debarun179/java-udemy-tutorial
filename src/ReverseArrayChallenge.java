import java.util.ArrayList;

public class ReverseArrayChallenge {
    private static int[] reverse(int[] array){
        int[] newarray = new int[array.length];
        for (int i=0; i< array.length;i++){
            newarray[array.length-i-1] = array[i];
            System.out.println(newarray[array.length-i-1]);
            System.out.println(array[i]);
        }
        return newarray;
    }

    public static void main(String[] args) {
        int[] ab = {1,2,3,4,5};
        ArrayList al = new ArrayList();
        int[] newa = reverse(ab);
        for (int i=0;i<newa.length;i++){
            System.out.println("Old: "+ab[i]+" New: "+newa[i]);
        }
    }
}
