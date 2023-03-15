//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float r= in.nextInt();
        circumference(r);
        area(r);

    }

    private static void area(float r) {
        float areac = (float) (3.14 *r* r);
        System.out.println("The area of circle is "+areac);
    }

    private static void circumference(float r) {
        float circumference = (float) (2*3.14*r);
        System.out.println("The circumference of circle is "+circumference);
    }
}
