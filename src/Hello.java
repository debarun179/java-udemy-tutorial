import java.text.DateFormat;
import java.time.LocalDate;
import java.util.*;

import static java.lang.Math.*;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(50000L + 10 * (10 + 20 + 50));
        String corrString = "Hello Debarun";
        String revString = "";
        char[] a = corrString.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
            revString += a[i];
        }
        System.out.println(revString);
        //Swap 2 numbers without using a third variable
        int num1 = 2;
        int num2 = 5;
        num2 = num2 * num1;
        num1 = num2 / num1;
        num2 = num2 / num1;
        System.out.println(num1 + " " + num2);

        //Check for a vowel in a string
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u')
                System.out.print(a[i]);
        }
        System.out.println("\nFibonacci");
        // Print Fibonacci
        int a1 = 0;
        int b1 = 1;
        int c1 = 1;
        int count = 10;
        for (int i = 1; i <= count; i++) {
            if (i == count)
                System.out.println(a1);
            else
                System.out.print(a1 + ", ");

            a1 = b1;
            b1 = c1;
            c1 = a1 + b1;
        }

        // Check if a list of integers contains only odd numbers
        int numArray[] = {3, 5, 7, 21, 65, 23};
        boolean containsOdd = true;
        for (int k = 0; k < numArray.length; k++) {
            if (numArray[k] % 2 == 0)
                containsOdd = false;
        }
        if (containsOdd)
            System.out.println("Contains only Odd");
        else
            System.out.println("Contains Even");

        // Palindrome
        String inputString = "DREDERD";
        boolean isPalindrome = true;
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1))
                isPalindrome = false;
        }
        if (isPalindrome)
            System.out.println(inputString + " is a palindrome");
        else
            System.out.println(inputString + " is not a palindrome");

        //Call Factorial function
        System.out.println("Factorial : " + factorialFinder(6));
        binarySearch(1);
        findLeapYear();
        findSecondLargestNo();
        listSetOps();
        getDistinctChar();
        checkArmstrong();
        bubbleSort();
        commonElements();
        countWords();
        sqrtFunc();
        int[] listNoOrig = {3,2,4,7,1,5,3,9,1};
        int[] listSorted = mergeSort(listNoOrig);
        for (int i=0;i<listSorted.length;i++)
            System.out.println(listSorted[i]);
    }

    public static int factorialFinder(int n) {
        if (n == 0) {
            return 1;
        } else
            return n * factorialFinder(n - 1);
    }
    public static void binarySearch(int numToFind) {
        int[] numArray = {1, 2, 2, 5, 6, 8, 9};
        int h = numArray.length-1;
        int l = 0;
        int mid = (l+h)/2;
        boolean foundNum = false;

        //System.out.println("Entering while with mid = "+ mid+" and l="+l+" and h="+h);
        while (l <= h) {
            if (numArray[mid] > numToFind) {
                h = mid - 1;
            }
            else if (numArray[mid] == numToFind){
                System.out.println("Found " +numToFind+" at index "+mid+" !!");
                foundNum = true;
                break;
            }
            else {
                l = mid + 1;
            }
            mid = (l+h) / 2;
            System.out.println("mid = "+ numArray[mid]+" and l="+l+" and h="+h);
        }
        if (!foundNum) System.out.println("Number not found");

    }
    public static void findLeapYear() {
        LocalDate currentdate = LocalDate.now();
        int counter = 10;
        int i = 0;
        while (counter != 0) {
            if ((currentdate.getYear() - i) % 4 == 0) {
                System.out.println(currentdate.getYear() - i);
                counter -= 1;
            }
            i += 1;
        }
    }
    public static void findSecondLargestNo(){
        int[] a = {1,22,3,22,333,21,211};
        int secondLargestNo = 0;
        int largestNo = 0;
        for (int i=0;i<a.length;i++) {
            if (largestNo < a[i])
                largestNo = a[i];
        }
        for (int i=0;i<a.length;i++){
            if (secondLargestNo<a[i] && a[i] != largestNo) {
                    secondLargestNo = a[i];
            }
        }
        System.out.println("Largest No = "+largestNo);
        System.out.println("Second Largest No = "+secondLargestNo);

    }
    public static void listSetOps(){
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(6);
        l.add(3);
        l.add(5);
        l.add(4);

        // Set declaration
        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(6);
        s.add(3);
        s.add(5);
        s.add(4);

        // printing list
        System.out.println("List = " + l);
        // printing Set
        System.out.println("Set = " + s);
        Locale locale = new Locale("en", "IN");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(new Date());
        System.out.println(date);
    }
    public static void getDistinctChar(){
        String testStr = "This is a test string";
        char[] charArr = testStr.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i=0;i<charArr.length;i++){
            if (hm.containsKey(charArr[i]))
                hm.put(charArr[i],hm.get(charArr[i])+1);
            else
                hm.put(charArr[i],1);
        }
    }
    public static void checkArmstrong(){
        int n = 154;
        Integer nInt = n;
        int sum = 0;
        for (int i=0;i<nInt.toString().length();i++) {
            sum += pow(floor(n/pow(10,i)%10),3);
            }
        System.out.println(sum==n?"Armstrong number":"Not an Armstrong number");
    }
    public static void bubbleSort(){
        int[] a = {1,4,3,6,2,7,22,32,11};
        for (int i=0;i<a.length;i++) {
            for (int j = 1; j < a.length-i; j++) {
                if (a[j-1] > a[j]) {
                    a[j] = a[j-1]+a[j];
                    a[j-1] = a[j]-a[j-1];
                    a[j] = a[j]-a[j-1];
                }
            }
        }
        for (int k=0;k<a.length;k++){
            System.out.print(a[k]+" ");
        }
    }
    public static void commonElements(){
        int[] a = {12,11,55,21,57,121,222};
        int[] b = {3,4,8,1,33,6,55,21,121};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if (a[i]==b[j])
                    System.out.println("Found match"+b[j]);
            }
        }
    }
    public static void countWords(){
        String sentence = "This is a sentence";
        int count=0;
        StringTokenizer st = new StringTokenizer(sentence);
        while(st.hasMoreTokens()){
            count=count+1;
            System.out.println(st.nextToken());
        }
        System.out.println("The sentence has "+count+" words");
    }
    public static void sqrtFunc(){
        int n=100;
        for (int i=1;i<=n/2;i++){
          //  System.out.println("n= "+n+" and i= "+i+" "+(float)i*i/n);
            if ((float)i*i/n==1){
                System.out.println(n+" has a square root of "+i);
            }
        }
    }
    //https://javahungry.blogspot.com/2013/06/java-sorting-program-code-merge-sort.html
    //https://javahungry.blogspot.com/2013/06/java-sorting-program-code-quick-sort.html
    //https://javahungry.blogspot.com/2013/06/java-sorting-program-code-insertion-sort.html
    public static int[] mergeSort(int []listNo){
        if (listNo.length<=1)
            return listNo;
        int [] leftList = new int[listNo.length/2];
        int [] rightList = new int[listNo.length-listNo.length/2];
        System.arraycopy(listNo,0,leftList,0,leftList.length);
        System.arraycopy(listNo,listNo.length/2,rightList,0,rightList.length);
        //System.out.println(leftList.length);
        //System.out.println(rightList.length);
        mergeSort(leftList);
        mergeSort(rightList);
        merge(leftList,rightList,listNo);
        return listNo;
        }
    private static void merge(int[] first, int[] second, int [] result) {
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;

        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
            } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        // copy what's left
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }

}
