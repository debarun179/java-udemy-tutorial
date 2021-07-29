import java.util.Scanner;

public class UdemyExercises {
    public static void main(String[] args) {
        if (isLeapYear(2000))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");

        System.out.println(areEqualByThreeDecimalPlaces(-3.4567d,-3.456d));
        System.out.println("Sum Total and Parameter sum is "+hasEqualSum(1,1,2));
        System.out.println("Has Teen: "+hasTeen(2,15,11));
        printYearsAndDays(1440);
        sumThreeFive();
        System.out.println("Palindrome: "+isPalindrome(-12221));
        System.out.println("Sum of First and Last Digits: "+sumFirstAndLastDigit(257));
        System.out.println("Even Digit Sum: "+getEvenDigitSum(123456789));
        System.out.println("Even Digit Sum: "+getEvenDigitSum(2521));
        System.out.println("Has Shared Digit: "+hasSharedDigit(9,99));
        System.out.println("Same Last Digit? "+hasSameLastDigit(105,101,300));
        System.out.println("GCD: "+getGreatestCommonDivisor(50,25));
        printFactors(18);
        System.out.println("Is Perfect Number: "+isPerfectNumber(5));
        //inputThenPrintSumAndAverage();
        System.out.println("Bucket Count: "+getBucketCount(-2.75,3.25,2.5,1));
    }

    public static boolean isLeapYear(int year){
        boolean leapYear = false;
        if (year<1 || year>9999){
            return leapYear;
        }

        if ((int)year%4==0 && (int)year%100!=0) {
             leapYear = true;
        } else if ((int)year%100==0){
                if ((int)year%400==0){
                    System.out.println("Inside 400");
                    leapYear=true;
                }
            }

        return leapYear;
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
        String numstr1 = Double.toString(num1).substring(0,Double.toString(num1).indexOf("."))+Double.toString(num1).substring(Double.toString(num1).indexOf("."),Double.toString(num1).indexOf(".")+4);
        String numstr2 = Double.toString(num2).substring(0,Double.toString(num2).indexOf("."))+Double.toString(num2).substring(Double.toString(num2).indexOf("."),Double.toString(num2).indexOf(".")+4);
        System.out.println(numstr1);
        System.out.println(numstr2);
        if (numstr1.equals(numstr2)){
            return true;
        }
        else return false;
    }
    public static boolean hasEqualSum(int n1, int n2, int sumn1n2){
        if (n1+n2==sumn1n2){
            return true;
        } else {
            return false;
        }
    }
    public static boolean hasTeen(int n1,int n2, int n3){
        if (isTeen(n1)||isTeen(n2)||isTeen(n3)) return true;
        else return false;
    }
    public static boolean isTeen(int n1){
        if (n1 >= 13 && n1 <=19) {
            return true;
        }
        else return false;
    }
    public static void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (60 * 24 * 365);
            long days = (minutes % (60 * 24 * 365))/(60*24);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
    public static void printEqual(int n1, int n2, int n3){
        if (n1<0 || n2<0 || n3 <0){
            System.out.println("Invalid Value");
        } else if (n1==n2 && n1 == n3){
            System.out.println("All numbers are equal");
        } else if (n1!=n2 && n2!=n3 && n1!=n3){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer==true && temperature>=25 && temperature <=45){
            return true;
        } else if (summer==false && temperature>=25 && temperature<=35){
            return true;
        } else {
            return false;
        }
    }
    public static void sumThreeFive(){
        int sum = 0;
        int count = 0;
        for (int i=1;i<=1000;i++){
            if (i%3==0 && i%5==0){
                System.out.println("Found number "+i);
                sum+= i;
                count++;
            }
            if (count==5) break;
        }
        System.out.println("Sum = "+sum);
    }
    public static boolean isOdd(int number){
        if (number <0) {
            return false;
        }
        if (number % 2!=0){
            return true;
        } else return false;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if (end<start || start<0 || end<0) {
            return -1;
        }
        for (int i=start;i<=end;i++){
            if (isOdd(i)==true){
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPalindrome(int number){
        String numStr = Integer.toString(number);
        boolean isPalindromeNum = false;
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(0) == '-') {
                if (numStr.charAt(i+1) != numStr.charAt(numStr.length() - i - 1))
                    return isPalindromeNum;
                continue;
            }
            else if (numStr.charAt(i) != numStr.charAt(numStr.length() - i - 1))
                return isPalindromeNum;
        }
        isPalindromeNum = true;
        return isPalindromeNum;
    }
    public static int sumFirstAndLastDigit(int number){
        if (number <0 ) {
            return -1;
        }
        int num = number;
        int sumDigit = 0;
        int i=0;
        while(num!=0){
            num = num/10;
            if (i==0) sumDigit += number - num * 10;
            i++;
        }
        System.out.println("Last Digit: "+Math.floor(number/Math.pow(10,(i-1))));
        sumDigit += Math.floor(number/Math.pow(10,(i-1)));
        return sumDigit;
    }
    public static int getEvenDigitSum(int number){
        if (number <0 ) {
            return -1;
        }
        int num = number;
        int sumEvenDigit = 0;
        int newnum = number;
        //int length = (int)(Math.log10(number)+1);
        //System.out.println("Number of digits: "+length);
        int i=(int)(Math.log10(number)+1); //12345/10 = 12345-1234*10
        while(num!=0){
            num = num/10;
            if (i%2==0) {
                sumEvenDigit += newnum-num*10;
                System.out.println("Even Digit: "+(newnum-num*10));
            }
            newnum = num;
            i--;
        }
        return sumEvenDigit;
    }
    public static boolean hasSharedDigit(int n1, int n2){
        boolean sharedFlag = false;
        if (n1<10 || n1 >99 || n2<10 || n2>99){
            return sharedFlag;
        }
        char[] n1str = (""+n1).toCharArray();
        char[] n2str = (""+n2).toCharArray();
        for (int i=0;i<n1str.length;i++){
            for (int j=0;j<n2str.length;j++){
                if (n1str[i]==n2str[j]){
                    return true;
                }
            }
        }
        return sharedFlag;
    }
    public static boolean hasSameLastDigit(int n1, int n2,int n3){
        boolean sharedFlag = false;
        if (n1<10 || n1 >1000 || n2<10 || n2>1000 || n3<10 || n3>1000){
            return sharedFlag;
        }
        int n1LastDigit = (int) (n1-10*Math.round(Math.floor(n1/10)));
        int n2LastDigit = (int) (n2-10*Math.round(Math.floor(n2/10)));
        int n3LastDigit = (int) (n3-10*Math.round(Math.floor(n3/10)));
        if (n1LastDigit == n2LastDigit || n2LastDigit == n3LastDigit || n1LastDigit == n3LastDigit){
            return true;
        }
        return sharedFlag;
    }
    public static int getGreatestCommonDivisor(int n1,int n2){
        int minnum = Integer.min(n1,n2);
        System.out.println("Min: "+minnum);
        if (n1<10 || n2<10) return -1;

        for (int i=minnum;i>1;i--){
            if (n1==minnum && minnum%i==0){
                System.out.println("i: "+i);
                if (n2%i==0) {
                    return i;
                }
            } else if (n2==minnum && minnum%i==0) {
                System.out.println("i: "+i);
                if (n1%i==0){
                    return i;
                }
            } ;
        }
        return -1;
    }
    public static void printFactors(int n1){
        if (n1<1) {
            System.out.println("Invalid Value");
        };

        for (int i=1;i<=n1;i++){
            if (n1%i==0){
                System.out.println(i);
            }
        }
    }
    public static boolean isPerfectNumber(int n1){
        if (n1<1) {
            return false;
        };
        int sum = 0;
        for (int i=1;i<=n1/2;i++){
            if (n1%i==0){
                sum +=i;
            }
        }
        if (sum==n1) {
            return true;
        }
        else return false;
    }
    public static void  inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int count = 0;
        boolean hasInt;

        while (true){
           // System.out.println("Enter a number: ");
            hasInt = scanner.hasNextInt();
            if (hasInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
                avg = (int) Math.round((double)sum/count);
                System.out.println((double)sum/count);
            } else {
                //System.out.println("Inputs done");
                break;
            }
        }
        System.out.println("SUM = "+sum+" AVG = "+avg);
        scanner.close();
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width<=0 || height <=0 || areaPerBucket <=0 || extraBuckets <0 ){
            return -1;
        }
        int bucketsNeeded = (int)Math.round((width*height)/areaPerBucket)-extraBuckets;
        return bucketsNeeded;
    }
}
