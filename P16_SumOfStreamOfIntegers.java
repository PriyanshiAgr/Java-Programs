/*import java.util.Scanner;

public class P16_SumOfStreamOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number times you want to input: ");
        int n = sc.nextInt();
        int time = 1;
        int sum = 0;
        while (time <= n) {
            int ele = sc.nextInt();
            sum += ele;
            time++;
        }
        System.out.println(sum);
    }
}
*/

import java.util.Scanner;

public class P16_SumOfStreamOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != -1) {
            sum += num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}