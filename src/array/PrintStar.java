package array;

/**
 * @author Soumen Karmakar
 * 9/6/2018
 */
public class PrintStar {

    public static void main(String[] args) {
        /*
         *   *
         *   **
         *   ***
         *   ****
         *   *****
         * */
        //printStar1(5);
        System.out.println("\n\n");
        printStar2(10);
    }

    private static void printStar1(int depth) {
        for (int i = 1; i <= depth; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printStar2(int depth) {

        int height, space, star;

        for (height = 1; height <= depth; height++) {
            for (space = depth - 1; space >= height; space--) {
                System.out.print(" ");
            }
            for (star = 1; star <= 2 * height - 1; star++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
