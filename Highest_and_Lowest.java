package kyu_7;

import java.util.Arrays;

public class Highest_and_Lowest {
    public static void main(String[] args) {
        String s="8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(highAndLow(s));
    }
    public static String highAndLow(String numbers) {
        // Code here or
        String[] arr=numbers.split(" ");
        int[] arr2= new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr2);
        int min=arr2[0];
        int max=arr2[arr2.length-1];
        String result=max+" "+min;
        return result;
    }
}
