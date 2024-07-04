package javadersim;

import java.time.LocalDate;

public class JavaDate {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        System.out.println(bugun);
        LocalDate sonIstifade;
        sonIstifade = bugun.plusDays(30);
        System.out.println(sonIstifade);
 
    }
}
