
import java.util.Scanner;

public class Minimum_Ternary {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter 1st number :");
      int num1 = sc.nextInt();

      System.out.println("Enter 2nd number :");
      int num2 = sc.nextInt();

      Minimum_Ternary ternary = new Minimum_Ternary();
      int min = ternary.min(num1,num2);

      System.out.println("Minimum number is : " + min);

  }
  public int min(int num1, int num2){
    return num1 < num2 ? num1 : num2;
  }
}