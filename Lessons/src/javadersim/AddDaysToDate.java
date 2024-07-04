package javadersim;

import java.time.LocalDate;

public class AddDaysToDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int SaxlanmaGunu = 21;
        LocalDate SonIstifadeTarixi = LocalDate.now().plusDays(SaxlanmaGunu);
        System.out.println("Buraxilish tariixi: "+ LocalDate.now());
        System.out.println("Son istifade tarixi: " + SonIstifadeTarixi);
    }
}
