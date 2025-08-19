package utils;

import java.util.Arrays;
import java.util.Scanner;

public final class IOUtils {
    private IOUtils(){

    }
    static Scanner in = new Scanner(System.in);

    public static int[] arrayInput(){
        int length = 0;

        System.out.println("Please enter the size of the array of integers: ");

        length = in.nextInt();

        while(length <= 0){
            System.out.println("Please enter a positive integer as the length of the array:");
            length = in.nextInt();
        }


        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Please enter the number " + (i+1) +" element of the array:" );
            arr[i] = in.nextInt();
        }

        System.out.println("You entered the array: " + Arrays.toString(arr));
        System.out.println();
        return arr;
    }

    public static int integerInput(){
        int num;

        System.out.println("Please enter an integer:");

        num = in.nextInt();

        return num;
    }

    public static String stringInput(){
        String input = "";

        System.out.println("Please type a string: ");

        input = in.nextLine();

        return input;

    }
}
