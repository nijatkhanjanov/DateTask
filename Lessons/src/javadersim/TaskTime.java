package javadersim;

import java.time.Duration;
import java.time.LocalTime;

public class TaskTime {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(14,15,20);
        LocalTime endTime = LocalTime.of(17,30,45);
        Duration ferq = Duration.between(startTime, endTime);

        long hours = ferq.toHours();
        long minutes = ferq.toMinutes()%60;
        long seconds = ferq.toSeconds()%60;


        System.out.println( "Hours: "+ hours+ " Minutes: "+ minutes+ " Seconds: "+ seconds) ;

    }
}
