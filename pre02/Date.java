import java.io.*;
import java.util.*;

public class Date {
    public static void main(String[] args){
      String day = "Monday";
      String date ="3rd";
      String month ="January";
      int year = 2022;
        System.out.print("American Format: ");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month + " ");
        System.out.print(date);
        System.out.print(", ");
        System.out.println(year);
        System.out.print("European Format: ");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(date + " ");
        System.out.print(month);
        System.out.print(", ");
        System.out.println(year);

    }
}