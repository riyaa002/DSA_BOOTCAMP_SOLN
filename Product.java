//Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = product(a,b);
        System.out.println("The product of "+a+" and "+b+" is "+ans);

    }

    private static int product(int a, int b) {
        int c = a*b;
        return c;
    }
}
