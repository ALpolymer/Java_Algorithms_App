import utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class Algorithms {
    private Algorithms() {
    }
    public static int[] compareScores(int[] arr1, int[] arr2){
        int[] resultArr = {0 , 0};


        for (int i = 0; i <= 2 ; i++) {
            int comparator = (arr1[i] - arr2[i] > 0) ? 1 : (arr1[i] - arr2[i] <0) ? 2 :3;

            switch (comparator){
                case 1 -> resultArr[0] ++;
                case 2 -> resultArr[1] ++;
            }
        }

        return resultArr;
    }

    public static int[] arrayDiagonals(int[][] arr){
        int size = arr[0].length;
        int[] results = {0 , 0};
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j) results[0] += arr[i][j];
                if(i+j == size-1) results[1] += arr[i][j];
            }
        }
        return results;
    }


    public static void stairCase(int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if(i+j>= height-1) {
                    System.out.print('#');
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static double[] integersFreq(int[] arr){
        double[] frequencies = new double[3];
        int numOfPositives = 0;
        int numOfNegatives = 0;
        double freqOfPositives = 0.0;
        double freqOfNegatives = 0.0;
        double freqOfZeroes = 0.0;

        for(int el : arr){
            if (el>0) numOfPositives++;
            if (el<0) numOfNegatives++;
        }

        freqOfPositives = (double) numOfPositives / arr.length;
        freqOfNegatives = (double) numOfNegatives / arr.length;
        freqOfZeroes = (double) (arr.length - numOfPositives - numOfNegatives) / arr.length;

        System.out.println("pos "+numOfPositives);
        System.out.println("neg "+numOfNegatives);
        System.out.println("len "+arr.length);
        System.out.println("zeroes "+(arr.length - numOfPositives - numOfNegatives));

        frequencies[0] = freqOfPositives;
        frequencies[1] = freqOfNegatives;
        frequencies[2] = freqOfZeroes;

        return frequencies;
    }

    public static int[] minMax(int[] arr){

        int maxSum = 0;
        int minSum = 0;
        int[] result = new int[2];

        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            minSum += arr[i];
            maxSum += arr[(arr.length-1)-i];
        }

        result[0] = minSum;
        result[1] = maxSum;

        return result;
    }

    public static int countMax(int[] arr){
        int max = Utils.findMax(arr);
        int count = 0;

        for(int el: arr){
            if(el == max) count ++;
        }

        return count;
    }

    public static int[] countRecords(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int maxCount = 0;
        int minCount = 0;
        int [] result = new int[2];

        for(int el : arr){
            if(el < min) {
                min =el;
                minCount++;
            }

            if(el>max){
                max = el;
                maxCount++;
            }
        }
        result[0] = maxCount;
        result[1] = minCount;

        return result;
    }

    public static boolean isPrime(int n){
        if (n<=1) return false;
        for (int i = 2; i <=  (int)Math.sqrt(n) ; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static String reverseStr(String str){

        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();

        for (int i = charArr.length-1; i >= 0 ; i--) {
            sb.append(charArr[i]);
        }

        return sb.toString();
    }

    public static int fib(int n){

        if (n == 0) return 0;
        if (n == 1) return 1;
        System.out.println("Calculating f(" + n + ")");
        return fib(n-1) + fib(n-2);
    }

    public static boolean anagram(String str1, String str2){

        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars2,chars1);

    }

    public static String removeDuplicates(String str){
        StringBuilder sb = new StringBuilder();
        char[] arr= str.toCharArray();

        for(char ch : arr){
            if(sb.indexOf("" + ch) == -1){
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void charMaxCount(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] arr = str.toCharArray();
        int max = 0;
        char maxChar = '\0';

        for(char ch: arr){
            if(hm.containsKey(ch)){
                hm.merge(ch , 1, (a,b)->a+b);
                int curr = hm.get(ch);
                if(curr > max){
                    max = curr;
                    maxChar = ch;
                }
            } else {
                hm.put(ch , 1);

                if(max < 1){
                    max = 1;
                    maxChar = ch;
                }
            }
        }

        System.out.println("Character with the biggest frequency is: "+maxChar +" : " + max);

    }

    public static boolean isPalindrome(String str){
        if(str == null || str.isEmpty() || str.length()==1 ) return false;
        for (int i = 0; i < str.length()/2; i++) {
            String start = String.valueOf(str.charAt(i));
            String end = String.valueOf(str.charAt(str.length()-1 - i));

            if(!start.equals(end)) return false;
        }

        return true;

    }

    public static String replaceWhitespaces(String str){
        char[] arr= str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char ch : arr){
            if (Character.toString(ch).equals(" ")) {
                sb.append("%20");
            } else {
                sb.append(Character.toString(ch));
            }
        }
        return sb.toString();
    }

    public static List<int[]>  targetSum(int[] arr, int target){
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] + arr[j] == target) {
                    int[] pair = {i,j};
                    result.add(pair);
                }
            }
        }
        return result;
    }

    public static int[] leftRotationOfArray(int[] arr, int offset){
        int rightOffset = arr.length - (offset % arr.length);
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int idx = (i+rightOffset) % arr.length;
            rotated[idx] = arr[i];
        }

        return rotated;
    }
}
