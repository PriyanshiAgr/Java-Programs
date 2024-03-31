import java.util.Scanner;

public class P22_SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
                System.out.print(i + " ");
            } else if (i % 2 == 0) {
                sum -= i;
                System.out.print("-" + i + " ");
            }
        }
        System.out.println();
        System.out.println("Sum of series: " + sum);
    }
}
