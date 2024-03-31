import java.util.Scanner;

public class P36_Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);
            }
        }
    }
}
