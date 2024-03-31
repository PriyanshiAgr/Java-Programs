import java.util.Scanner;

public class P14_forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) { // i works similar as num in while loop
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
