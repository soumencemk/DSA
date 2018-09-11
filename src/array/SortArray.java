package array;

import java.util.Arrays;

/**
 * @author Soumen Karmakar
 * 9/6/2018
 */
public class SortArray {

    public static void main(String[] args) {
        int[] arr = {11, 15, 26, 38, 9, 10};
        System.out.println("BEFORE " + Arrays.toString(arr));
        sortAsc(arr);
        System.out.println("AFTER " + Arrays.toString(arr));

    }

    private static void sortAsc(int[] arr) {
        for (int j = 0; j < arr.length; j++)
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
    }
}
