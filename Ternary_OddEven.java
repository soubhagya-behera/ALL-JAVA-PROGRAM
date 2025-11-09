import java.util.Scanner;

public class Ternary_OddEven {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter your number :");
      int num = sc.nextInt();

      String result = num % 2 ==0 ? "Even" : "Odd";
      System.out.println("Your number is " + result);

  }
}
