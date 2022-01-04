// Ask the user to guess the random number between 1-100 inlcuding both. 
import java.util.Random;
import java.util.Scanner;
public class Guess{

    public static void main(String[] args) {
        // pick a random number
        int guess = 0;
        int offby = 0;
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
        // Welcome and Ask the user for input 
        System.out.println("I'm thinking of a number between 1 to 100, inlcuding both. Can you guess the number?");
        System.out.print("Guess the number: ");
        Scanner in = new Scanner(System.in);
        guess = in.nextInt();
        System.out.println("Your guess is: " +guess);
        // Reveal to the user the answer and by how off they are.
        System.out.println("The number I was thinking of is:" +number);
        offby = number - guess;
        offby = Math.abs(offby);
        System.out.println("You were off by:" +offby);
    }
}