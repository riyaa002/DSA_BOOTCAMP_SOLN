//Define a method to find out if a number is prime or not.
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int no = in.nextInt();
        prime(no);
    }

    private static void prime(int no) {
        int count = 0;
        for (int i = 1; i <= no; i++)
        {
            if (no % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(no + " is prime");
        else
            System.out.println(no + " is not prime");
    }
}
