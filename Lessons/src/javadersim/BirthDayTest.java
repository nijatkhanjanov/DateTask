package javadersim;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class BirthDayTest {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1991, 12, 24);
        LocalDate today = LocalDate.now();
        System.out.println("Birthday: " + birthDay);
        long ageByDay = today.toEpochDay() - birthDay.toEpochDay();
             System.out.println(ageByDay);
             long ageByDay2 = ChronoUnit.DAYS.between(birthDay,today);
        System.out.println(ageByDay2);
    }
}
