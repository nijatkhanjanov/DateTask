import java.util.Random;
import java.util.Scanner;

public class ArrayMehhemmed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Arrayin olchusunu daxil edin:");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
        array[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }






    }
}
