import java.util.Scanner;

public class P15_DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 20;
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);
    }
}
