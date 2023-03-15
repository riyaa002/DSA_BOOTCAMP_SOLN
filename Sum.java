//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = sum(a,b);
        System.out.println(ans);
    }

    private static int sum(int a, int b) {
        int c = a+b;
        return c;
    }
}
