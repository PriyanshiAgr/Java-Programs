import java.util.Scanner;

// creating class
class Algebra {
    // creating method having default access modifier
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class P42_AddNumsUsingMethod {
    // creating object for algebra class
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers you want to add: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.print("Sum of input numbers is ");
        int res = obj.add(first, second);
        System.out.print(res);
    }
}
