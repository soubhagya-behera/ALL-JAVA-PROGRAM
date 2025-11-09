
import java.util.Scanner;

public class ExitOnSpecific {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(true) {
        System.out.println("Enter your command :");
        String commannd = sc.next();
        if(commannd.equalsIgnoreCase("exit")) {
          break;
        }
      }
      System.out.println("You have successfully entered");
  }
}