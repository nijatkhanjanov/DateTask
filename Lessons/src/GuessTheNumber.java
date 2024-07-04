import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int targetNumber = rnd.nextInt(100);

        System.out.println("Let the game begin!!!");

        System.out.println("Enter your name: ");
        String name = sc.nextLine();


        int [] guesses = new int[100];
        int attempts = 0;

        while (true) {
            System.out.println("Guess the number: ");
            while(!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number: ");
                sc.next();
            }

        }

    }
}
