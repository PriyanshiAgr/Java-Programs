import java.util.Scanner;

public class P38_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        int num = sc.nextInt();
        int pow = 1;
        int ans = 0;
        while (num > 0) {
            int rem = num % 2;
            ans += rem * pow;
            num /= 2;
            pow *= 10;
        }
        System.out.println(ans);
    }
}
