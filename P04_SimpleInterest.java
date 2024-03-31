import java.util.Scanner;

public class P04_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SI = (PxRxT) divide by 100
        System.out.print("Enter principle: ");
        float P = sc.nextFloat();
        System.out.print("Enter rate: ");
        float R = sc.nextFloat();
        System.out.print("Enter time: ");
        float T = sc.nextFloat();
        float SI = (P * R * T) / 100;
        System.out.print("Simple Interest: " + SI);
    }
}
