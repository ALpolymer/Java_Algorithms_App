package utils;

import java.util.ArrayList;
import java.util.Arrays;

public final class Utils {
    private Utils(){

    }

    public static int findMax(int[] arr){
        if(arr.length == 1) return arr[0];
        return Math.max(arr[0] , findMax(Arrays.copyOfRange(arr, 1, arr.length)));
    }

    public static int[] findMaxIndex(int[] arr){
        int max = findMax(arr);
        ArrayList<Integer> indexesOfMax = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max) indexesOfMax.add(i);
        }
        return indexesOfMax.stream().mapToInt(i->i).toArray();
    }

    public static int add(int a,int b){
        int sum = 0;
        sum= a + b;
        return sum;
    }

    public static int addArrayValues(int[] arr){
        return  Arrays.stream(arr)
                .reduce(0 ,(a,b) -> a + b);
    }
}
