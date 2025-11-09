/*
Write a java program that prompts the user to enter an integer and determines whether 
it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible 
by 5 or 6, but not both
*/
import java.util.Scanner;
public class Division_Prob{
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Check divisibility
        boolean divisibleBy5 = number % 5 == 0;
        boolean divisibleBy6 = number % 6 == 0;

        // Display results
        System.out.println("Is " + number + " divisible by 5 and 6? " + (divisibleBy5 && divisibleBy6));
        System.out.println("Is " + number + " divisible by 5 or 6? " + (divisibleBy5 || divisibleBy6));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (divisibleBy5 ^ divisibleBy6));

        sc.close();
    }
}
 