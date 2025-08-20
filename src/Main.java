

import utils.IOUtils;
import utils.Utils;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
     arrayDiagonalsImpl();

    }


    public static void addAppImpl(){
       int a = IOUtils.integerInput();
       int b = IOUtils.integerInput();

        System.out.println("Το άθροισμα των " + a +"," +  b + " είναι: " + Utils.add(a,b));
    }


    public static void addArrayValuesImpl(){
        int [] arr = IOUtils.arrayInput();
        System.out.println("The sum of all integers in the array is:"
                + Utils.addArrayValues(arr));
    }

    public static void compareScoresImpl(){
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i <= 2 ; i++) {
            int score = Integer.MIN_VALUE;

            while(score<0 || score >100){

                System.out.println("Insert the no"+(i+1)+" score of Bob");
                score = in.nextInt();

                if(score<0 || score >100) System.out.println("Score must be an integer from 0 to 100");
            }

            arr1[i] = score;
        }

        for (int i = 0; i <= 2 ; i++) {
            int score = Integer.MIN_VALUE;

            while(score<0 || score >100){
                System.out.println("Insert the no"+(i+1)+" score of Alice");
                score = in.nextInt();

                if(score<0 || score >100) System.out.println("Score must be an integer from 0 to 100");
            }

            arr2[i] = score;
        }

        String result = Arrays.toString(Algorithms.compareScores(arr1,arr2));

        System.out.println("The scores for Bob and Alice are: " + result);
    }

    public static void arrayDiagonalsImpl(){
      int [][] arr = IOUtils.squareMatrixInput();

        int[] result = Algorithms.arrayDiagonals(arr);

        System.out.println("The sum of elements of the main diagonal = " + result[0]);
        System.out.println("The sum of elements of the secondary diagonal = " + result[1]);

        System.out.println("The absolute difference of the diagonals = " + Math.abs(result[0]-result[1]));
    }

    public static void stairCaseImpl(){
        int height;
        System.out.println("Please define the height of the staircase:");

        height = in.nextInt();

        Algorithms.stairCase(height);
    }

    public static void integersFreqImpl(){
        double[] result = new double[3];

        int[] arr = IOUtils.arrayInput();

        result = Algorithms.integersFreq(arr);

        System.out.println(Arrays.toString(result));
    }

    public static void minMaxSumImpl(){
        int [] arr = new int[5];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter the number " + (i+1) +" integer of the array:" );
            arr[i] = in.nextInt();
        }

        int [] result = Algorithms.minMax(arr);

        for(int el : result){
            System.out.print(el + " ");
        }
    }

    public static void maxCountImpl(){

        int[] arr = IOUtils.arrayInput();

        System.out.println("The max element count is: " + Algorithms.countMax(arr));
    }


    public static void countRecordsImpl(){
        int[] arr = IOUtils.arrayInput();

        System.out.println(Arrays.toString(Algorithms.countRecords(arr)));

    }

    public static void findMaxIndexImpl(){
        int[] arr =IOUtils.arrayInput();

        System.out.println("The max element found in indexes: "+Arrays.toString(Utils.findMaxIndex(arr)));

    }

    public static void isPrimeImpl(){
        int num = IOUtils.integerInput();

        System.out.println("Number"+ " " + num +" is prime: " +Algorithms.isPrime(num));
    }

    public static void reverseStrImpl(){
        String str = IOUtils.stringInput();

        String reversed = Algorithms.reverseStr(str);

        System.out.println(reversed);
    }

    public static void fibImpl(){
        int n = IOUtils.integerInput();

        System.out.println("The "+n +"th Fibonacci number is: " +Algorithms.fib(n));
    }

    public static void anagramImpl(){
        String str1 = null;
        String str2 = null;
        System.out.println("Type the first string: ");

        str1 = IOUtils.stringInput();

        System.out.println("Type the second string: ");
        str2 = IOUtils.stringInput();

        System.out.println("The strings are anagrams: " + Algorithms.anagram(str1, str2));
    }

    public static void removeDuplicatesImpl(){
        String str = "";
        str = IOUtils.stringInput();
        System.out.println(Algorithms.removeDuplicates(str));
    }

    public static void charMaxCountImpl(){
        String str = IOUtils.stringInput();
        Algorithms.charMaxCount(str);
    }

    public static void isPalindromeImpl(){
        String str = IOUtils.stringInput();
        System.out.println("The string is palindrome: " + Algorithms.isPalindrome(str));
    }

    public static void replaceWhitespacesImpl(){
        String str = IOUtils.stringInput();

        System.out.println(Algorithms.replaceWhitespaces(str));
    }

    public static void targetSumImpl(){
        int[] arr = IOUtils.arrayInput();
        System.out.println("Please enter the target sum below ");
        int target = IOUtils.integerInput();

        List<int[]> pairs = Algorithms.targetSum(arr, target);

        if (pairs.isEmpty()) {
            System.out.println("No pairs found that sum up to the target.");
        } else {
            System.out.println("Found the following pairs:");
            for (int[] pair : pairs) {
                System.out.println(Arrays.toString(pair));
            }
        }

    }

    public static void leftRotationOfArrayImpl(){
        int[] arr = IOUtils.arrayInput();
        System.out.println("Please enter a positive integer for left rotation offset \n or a negative integer for right rotation offset");
        int offset = IOUtils.integerInput();

        System.out.println("The rotated array is: " + Arrays.toString(Algorithms.leftRotationOfArray(arr, offset)));
    }

}

