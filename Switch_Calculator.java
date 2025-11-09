import java.util.Scanner;

public class Switch_Calculator {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter 1st number :");
      int num1 = sc.nextInt();

      System.out.println("Enter 2nd number :");
      int num2 = sc.nextInt();

      System.out.println("Enter the opeartion : ");
      String operation = sc.next();

      int result = switch (operation) {
        case "+" -> num1 + num2;
        case "-" -> num1 - num2;
        case "*" -> num1 * num2;
        case "/" -> num1 / num2;
        default -> -1;
      };
    System.out.println("Your result is " + result);
   }
}
// } 05:25:00
