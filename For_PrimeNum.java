import java.util.Scanner;

public class For_PrimeNum {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number you want to check : ");
      int num = sc.nextInt();

     // boolean isPrime = isPrime(num); -- We can write direct below
      System.out.println("Your number is " + (isPrime(num) ? "Prime" : "Not Prime"));
  }

  public static boolean isPrime(int num) {
    for(int i = 2; i < num; i++) {
      if(num % i == 0){
        return false;
      }
    }
    return true;
  }
}

// 06:30:17