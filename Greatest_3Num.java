
import java.util.Scanner;


public class Greatest_3Num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a =sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b =sc.nextInt();
        System.out.print("Enter 3rd number :");
        int c =sc.nextInt();

        if (a>b && b>c){
            System.err.println("greatest :" + a);
        }
        else if (b>a && a>c) {
            System.err.println("greatest :" +b);
        }
        else{
            System.out.println("greatest :"+c);
        }
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Greatest: " + max);
        System.out.println("Smallest: " + min);
    }
}
*/

