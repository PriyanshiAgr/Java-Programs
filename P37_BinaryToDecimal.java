import java.util.Scanner;

public class P37_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = sc.nextInt();
        int pow = 1;
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * pow;
            num /= 10;
            pow *= 2;
        }
        System.out.println(ans);
    }
}
