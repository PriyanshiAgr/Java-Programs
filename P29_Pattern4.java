import java.util.Scanner;

/*
   ****
   ***
   **
   *
 */
public class P29_Pattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
