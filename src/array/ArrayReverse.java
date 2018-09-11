package array;

/**
 * @author Soumen Karmakar
 * 9/6/2018
 */
public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(arr);
        printArr(arr);
        System.out.println("MIN ELEMENT IS : " + findMin(arr));
        System.out.println("MAX ELEMENT IS : " + findMax(arr));
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
