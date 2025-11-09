import java.util.Scanner;

public class DoWhile_Password {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String password;

      do { 
          System.out.println("Enter the password: ");
          password = sc.next();
      } while (! isValidPassword(password));

      System.out.println("Thanks, you entered correct password");
  }

  public static boolean isValidPassword(String password){
    return password.length() > 6;
  }
}