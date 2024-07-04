package javadersim;

import java.time.LocalDateTime;
import java.time.Duration;

public class DateTest {
    public static void main(String[] args) {
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = LocalDateTime.of(2025, 7, 3, 18, 30);
        Duration duration = Duration.between(startDateTime, endDateTime);
        long days = duration.toDays();
        long hours = duration.toHours() %24;
        long minutes = duration.toMinutes() % 60;
        System.out.println("Difference: "+ days +"days"+" " + hours + " hours " + minutes + " minutes");
    }
}
