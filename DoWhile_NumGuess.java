import java.util.Scanner;

public class DoWhile_NumGuess {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int num = 5, guess;

      do { 
          System.out.print("Please guess the number between 0 and 10: ");
          guess = sc.nextInt();
      } while (num != guess);

      System.out.println("You have successfully guess the number");
  }
}