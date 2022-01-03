import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
        int hour = 10;
        double hours =10.0;
        int minute =47;
        int second =20;
        String timeofday = ("am");
        int seconds2midnight =(hour * 3600);
        int numofsecstil =(24 - hour) * 3600;
        double percentofdaypast = (hour / 24.0) * 100.0;
        int currenthour = 11;
        int currentminute = 37;
        int currentsecond = 35;
        int elaspedhour = currenthour - hour;
        int elaspedminute = currentminute - minute;
        int elaspedsecond = currentsecond - second; 
        System.out.println("Number of seconds since midnight: "+seconds2midnight +timeofday);
        System.out.println("Number of seconds remaining until midnight: "+numofsecstil+timeofday);
        System.out.println("Percentage of the day that has passed: " +percentofdaypast +"%");
       System.out.println("Time elasped since working: " +elaspedhour +":" +elaspedminute +":" +elaspedsecond);

    }
}
   