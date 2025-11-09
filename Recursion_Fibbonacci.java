
import java.util.Scanner;

public class Recursion_Fibbonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to printing  of fibonacci series: \n");
    System.out.print("Enter the number of elements to be printed: ");
    int count = sc.nextInt();

    System.out.println("Your Fibonacci series will be: ");
    for(int i=1; i<=count; i++){
      System.out.print(fibonacci(i) + " ");
    }
    
  }

  public static int fibonacci(int possition) {
    if(possition == 1){
      return 0;
    }
    if(possition == 2){
      return 1;
    }
    return fibonacci(possition -1) + fibonacci(possition - 2);
  }
}
