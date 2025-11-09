import java.util.*;

public class EvenNum {
    public static void main(String args[]) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        
        System.out.println("Even numbers up to " + n + " are:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
