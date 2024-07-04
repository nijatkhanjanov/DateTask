import java.util.Scanner;

public class ex0004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (1 <= a && a <= 3) {
            System.out.println("Initial");
        }
        if (4 <= a && a <= 6) {
            System.out.println("Average");
        }
        if (7 <= a && a <= 9) {
            System.out.println("Sufficient");
        }  if (10 <= a && a<= 12) {
            System.out.println("High");

        }
    }
}