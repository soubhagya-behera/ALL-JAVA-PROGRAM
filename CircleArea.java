import java.util.*;
public class CircleArea{
    public static void main(String args[]) {
        System.out.println("Enter the radius of circle");
        Scanner sc= new Scanner(System.in);
        float radius=sc.nextFloat();
        double area=3.141*radius*radius;

        
        System.out.println("area of circle is :" + area);

    }
}