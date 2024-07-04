import java.util.Scanner;

public class FizzBuzzApp {
    public static void main(String[] args) {
        // eded 3 bolunurse Fizz
        //eded 5 bolunurse buzz
        //her ikisine bolunurse fizzbuzz
        //hech birine bolunmurse ededin ozu chap olunsun konsola

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%3==1 && num%5==2){
            System.out.println("FizzBuzz");
        }else if (num%5==2){
            System.out.println("Buzz");
        }else if  (num%3==1){
            System.out.println("Fizz");
        }else System.out.println(num);

    }
}
