import java.util.Scanner;

public class P02_Input {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Int input
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    System.out.println(num);
    // String input
    System.out.println("Enter your name:");
    String name = sc.next();
    System.out.println(name);
    String fullname = sc.nextLine();
    System.out.println(fullname);
    // float name
    System.out.println("Enter a float number:");
    float numb = sc.nextFloat();
    System.out.println(numb);
  }
}
