package array;

import java.util.Arrays;

/**
 * @author Soumen Karmakar
 * 9/6/2018
 */
public class Search {

    public static void main(String[] args) {
        int[] arr = {11, 15, 26, 38, 9, 10};
        System.out.println("ARRAY " + Arrays.toString(arr));
        int search = 49;
        System.out.println(search + " :: FOUND IN ARRAY : " + searchInArr(arr, search));
    }

    private static boolean searchInArr(int[] arr, int search) {
        for (int i : arr) {
            if (i == search) {
                return true;
            }
        }
        return false;
    }
}
