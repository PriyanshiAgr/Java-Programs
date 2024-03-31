import java.util.Scanner;

public class P09_ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // using ternary operator
        String ans;
        ans = (num % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(ans);
    }
}
