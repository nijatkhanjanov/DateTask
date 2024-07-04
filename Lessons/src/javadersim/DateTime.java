package javadersim;



import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = date.atStartOfDay();
        System.out.println("LocalDateTime: " + dateTime);
    }
}
