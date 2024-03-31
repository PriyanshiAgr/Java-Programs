import java.util.Scanner;

public class P13_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        while (num <= n) {
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
