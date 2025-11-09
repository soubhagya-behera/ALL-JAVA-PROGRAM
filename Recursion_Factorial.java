
import java.util.Scanner;

public class Recursion_Factorial {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the number : ");
      int num = sc.nextInt();

      long fact = factorial(num);
      System.out.println("Factorial of number " + num + " is " + fact);
  }

  public static long factorial(int num){
    System.out.println("Function called for: "+ num);
    if(num == 1){
      return 1;
    }
    else{
    return num * factorial(num - 1);
    }
  }
  

  /*public static long FactorialIterative{
   long result = 1;
   for (int i = 1; i<=num; i++){
   result *= i;
   }
   return result;
  }
*/
}