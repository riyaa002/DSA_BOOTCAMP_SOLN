
import java.util.Scanner;

public class asg2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//Write a program to print whether a number is even or odd, also take input from the user.
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if (num%2 == 0){
            System.out.println("Number "+num+" is even");
        }
        else {
            System.out.println("Number is odd");
        }

// Take name as input and print a greeting message for that particular name.
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Hello "+name);


// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        System.out.println("Enter principal amount");
        int p = input.nextInt();
        System.out.println("Enter rate of interest in %");
        int r = input.nextInt();
        System.out.println("Enter time in year");
        int t = input.nextInt();
        int SI = (p*r*t)/100;
        System.out.println("Simple interest is: "+SI);


//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


// Take 2 numbers as input and print the largest number.
        System.out.println("Enter two numbers:");
        int no1 = input.nextInt();
        int no2 = input.nextInt();
        if (no1>no2){
            System.out.println(no1+" is greater");
        }
        else {
            System.out.println(no2+" is greater");
        }

//Input currency in rupees and output in USD.
        System.out.println("Enter rupees");
        int rupees = input.nextInt();
        double usd = rupees*0.012;
        System.out.println(rupees+"Rupees in usd is "+usd);


// To calculate Fibonacci Series up to n numbers.
        System.out.println("Enter a number");
        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println("Fiboncci series is: ");
        for(int i=1;i<=n;i++){
            System.out.println(n1);
            int n3 = n2+n1;
            n1=n2;
            n2=n3;

        }


//To find out whether the given String is Palindrome or not.
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i); //char at index i > i is index number starting from 0 and so on
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");


//To find Armstrong Number between two given number.
// An Armstrong number is a number which equals to the sum of the cubes of its individual digits.
        int num1, num2;
        System.out.println("Enter the first number ::");
        num1 = input.nextInt();
        System.out.println("Enter the second number ::");
        num2 = input.nextInt();

        for (int i = num1; i<num2; i++){
            int check, rem, sum = 0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if(sum == i){
                System.out.println(""+i+" is an Armstrong number.");
            }
        }


    }
}
