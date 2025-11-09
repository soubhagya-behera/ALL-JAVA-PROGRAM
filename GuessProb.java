import java.util.Random;
import java.util.Scanner;

public class GuessProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int computerGuess = rand.nextInt(9) + 1; // 1 to 9

        System.out.print("Enter user number (1-9): ");
        int userNumber = sc.nextInt();

        System.out.println("Computer guesses: " + computerGuess);

        if (userNumber == computerGuess)
            System.out.println("You got it right");
        else if (Math.abs(userNumber - computerGuess) == 1)
            System.out.println("Almost got it");
        else
            System.out.println("You got it wrong");

        sc.close();
    }
}
