package array;

import java.util.Arrays;

/**
 * @author Soumen Karmakar
 * 9/6/2018
 */
public class FindPairWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {11, 15, 26, 38, 9, 10};
        int[] pair = findPairWithSum(arr, 35);

        System.out.println(Arrays.toString(arr));
        if (!(pair[0] == 0 && pair[1] == 0)) {
            System.out.println("PAIR (" + pair[0] + "," + pair[1] + ") = 35");
        } else {
            System.out.println("NO PAIR FOUND");
        }

    }

    private static int[] findPairWithSum(int[] arr, int sum) {
        int pair[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (arr[i] + arr[j] == sum) {
                        pair[0] = arr[i];
                        pair[1] = arr[j];
                        return pair;
                    }
                }
            }
        }
        return pair;
    }

}
