package array;

/**
 * @author Soumen Karmakar
 * 9/6/2018
 */
public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        printArr(arr);
        leftRotate(arr,4);
        System.out.println(":: LEFT ROTATION ::");
        printArr(arr);
        rightRotate(arr);
        System.out.println(":: RIGHT ROTATION ::");
        printArr(arr);
    }

    private static void leftRotate(int[] arr,int d) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr);
        }
    }

    private static void rightRotate(int[] arr) {

    }

    private static void leftRotateByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
