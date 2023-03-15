//Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
public class Factorial {
    public static void main(String[] args) {
        factorial(4);
        factorial(1);
        factorial(0);
    }

    private static void factorial(int n) {
        int ans = 0;
        if(n == 1){
            ans = 1;
            System.out.println("The factorial of "+n+" is "+ans);
        } else if (n == 0) {
            ans = 1;
            System.out.println("The factorial of "+n+" is "+ans);
        }else{
            for (int i = 1; i < n; i++) {
                ans = i * n;
            }
            System.out.println("The factorial of "+n+" is "+ans);
        }

    }
}
