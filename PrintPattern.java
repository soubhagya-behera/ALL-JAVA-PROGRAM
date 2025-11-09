import java.util.*;

public class PrintPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= m; j++) {
                System.out.print("* "); // Print * on the same line
            }
            System.out.println(); // Move to the next line
        }
        sc.close();
    }
}
