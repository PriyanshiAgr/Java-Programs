import java.util.Scanner;

/*
   1
  121
 12321
1234321
 */
public class P35_Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int c = sc.nextInt();
        for(int i =1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print(k);
            }
            for(int l = i-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
