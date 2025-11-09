import java.util.Scanner;

public class Ternary_StudScore {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter your mark : ");
      int marks = sc.nextInt();

      String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");

      System.out.println("Your category is : " + category);
  }
}
