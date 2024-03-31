import java.util.Scanner;

public class P11_CheckDivBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // WAP to print the value if it is divisible by 3 or 5
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 || num % 5 == 0) {
            System.out.println(num + " is disible by 3 or 5.");
        }
    }
}
