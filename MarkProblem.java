//Make a menu driven program,The user can enter 2 numbers, either 0 or 1, if 0 then stop and if 1 then take input:-
import java.util.*;

public class MarkProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter your choice (1 to enter marks, 0 to stop):");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the marks (0-100):");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                }
            }

        } while (choice != 0);

        System.out.println("Program Stopped.");
        sc.close();
    }
}
