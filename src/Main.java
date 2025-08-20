

import utils.IOUtils;
import utils.Utils;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int choice;
     do{
         System.out.println();
         System.out.println("---->ALGORITHMS<----");
         System.out.println("Please select one of the following algorithms:");
         System.out.println("0. Exit application");
         System.out.println("1. Add Integers");
         System.out.println("2. Add array values");
         System.out.println("3. Compare scores of Alice and Bob");
         System.out.println("4. Find sum of 2d square matrix diagonals");
         System.out.println("5. Draw staircase");
         System.out.println("6. Find relative frequencies of positive, negative, and zeroes from an array");
         System.out.println("7. Find the sum of n-1 smaller and biggest integers of n length array");
         System.out.println("8. Find frequency of the max element of array");
         System.out.println("9. Count records breaking");
         System.out.println("11. Find if a positive integer is prime");
         System.out.println("12. Reverse a string");
         System.out.println("13. Find the n-th fibonacci number");
         System.out.println("14. Check if a string is an anagram");
         System.out.println("15. Remove duplicate characters from a string");
         System.out.println("16. Find the character with the maximum number of occurrences in a string");
         System.out.println("17. Check if a string is a palindrome");
         System.out.println("18. Replace whitespaces in string");
         System.out.println("19. Find pairs of integers in an array that sum up to a target sum");
         System.out.println("20. Rotate the elements of an array given a fixed offset");




         choice = in.nextInt();

         switch (choice){
             case 0 -> System.out.println("Exiting app...");
             case 1 -> addAppImpl();
             case 2 -> addArrayValuesImpl();
             case 3 -> compareScoresImpl();
             case 4 -> arrayDiagonalsImpl();
             case 5 -> stairCaseImpl();
             case 6 -> integersFreqImpl();
             case 7 -> minMaxSumImpl();
             case 8 -> maxCountImpl();
             case 9 -> countRecordsImpl();
             case 10 -> findMaxIndexImpl();
             case 11 -> isPrimeImpl();
             case 12 -> reverseStrImpl();
             case 13 -> fibImpl();
             case 14 -> anagramImpl();
             case 15 -> removeDuplicatesImpl();
             case 16 -> charMaxCountImpl();
             case 17 -> isPalindromeImpl();
             case 18 -> replaceWhitespacesImpl();
             case 19 -> targetSumImpl();
             case 20 -> leftRotationOfArrayImpl();


             default -> System.out.println("\nWrong choice...");
         }
     } while (choice != 0);

        System.out.println("Goodbye!!!");


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

        System.out.println("The frequency of positives is: " + result[0]);
        System.out.println("The frequency of negatives is: " + result[1]);
        System.out.println("The frequency of zeroes is: " + result[2]);
    }

    public static void minMaxSumImpl(){
        int[] arr = IOUtils.arrayInput();
        int [] result = Algorithms.minMax(arr);

        System.out.println("The sum of the " + (arr.length-1) + " smallest integers = " + result[0]);
        System.out.println("The sum of the " + (arr.length-1) + " biggest integers = " + result[1]);

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

