import java.util.Scanner;

public class MinElement {
    private static Scanner scanner = new Scanner(System.in);

    private static int[] readIntegers(int count){
        int[] inputArray = new int[count];
        for (int i=0;i<count;i++){
            System.out.println("Enter number: \r");
            inputArray[i] = scanner.nextInt();
        }
        return inputArray;
    }

    private static int findMin(int[] inputArray) {
        int minVal=Integer.MAX_VALUE;
        for (int i=0; i<inputArray.length;i++){
            if (inputArray[i]<minVal) {
                minVal = inputArray[i];
            }
        }
        return minVal;
    }

    public static void main(String[] args) {
        System.out.println("Enter the count of numbers: \r");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println("Min value: "+findMin(array));
        scanner.close();
    }
}
