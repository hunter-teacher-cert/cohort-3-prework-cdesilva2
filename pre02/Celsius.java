import java.util.Scanner;

/**
 * Converts Celsius to Fahrenheit
 */
public class Celsius {

    public static void main(String[] args) {
        double cel;
        double far;
        final double fardiv = (9/5);
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.println("Celsius to Fahrenheit");
        System.out.print("Enter a temperature in Celsius: ");
        cel = in.nextDouble();

        // convert and output the result
        far = (cel * fardiv) + 32;
        System.out.println(cel +" C = " +far +" F = ");
    }
}