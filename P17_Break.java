import java.util.Scanner;

public class P17_Break {
    public static void main(String[] argd) {
        for (int i = 1;; i++) {
            if ((i % 5 == 0) && (i % 7 == 0)) {
                System.out.println(i);
                break;
            }
        }
    }
}
