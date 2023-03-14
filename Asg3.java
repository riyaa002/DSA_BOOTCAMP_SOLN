package com.riya;

import java.util.Scanner;

public class Asg3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//  Area Of Circle Java Program
//        System.out.println("Enter the radius of circle");
//        double r = input.nextInt();
//        double area = r * r * 3.14;
//        System.out.println("The are of circle is: "+area);

//  Area Of Triangle
//        System.out.println("Enter base and height of triange");
//        int b = input.nextInt();
//        int h = input.nextInt();
//        int area = (int) (0.5 * b * h);
//        System.out.println("The area of triangle is: "+area);

//        Area Of Rectangle Program
//        System.out.println("Enter base and height of Rectangle");
//        int l = input.nextInt();
//        int b = input.nextInt();
//        int area = (int) (l * b);
//        System.out.println("The area of Rectangle is: "+area);

//        Area Of Isosceles Triangle
//        Area Of Parallelogram
//        Area Of Rhombus
//        Area Of Equilateral Triangle
//        Perimeter Of Circle
//        Perimeter Of Equilateral Triangle
//        Perimeter Of Parallelogram
//        Perimeter Of Rectangle
//        Perimeter Of Square
//        Perimeter Of Rhombus
//        Volume Of Cone Java Program
//        Volume Of Prism
//        Volume Of Cylinder
//        Volume Of Sphere
//        Volume Of Pyramid
//        Curved Surface Area Of Cylinder
//        Total Surface Area Of Cube
//        Fibonacci Series In Java Programs

//        Subtract the Product and Sum of Digits of an Integer
//        System.out.println("Enter a integer");
//        int n = input.nextInt();
//        int sum = 0;
//        int product = 1;
//        while (n >0){
//            sum += n % 10;
//            product *= n%10;
//            n = n/10;
//        }
//        int ans = product - sum;
//        System.out.println("Subtraction of the Product and Sum of Digits of an Integer is: "+ans);



//  Input a number and print all the factors of that number (use loops).
//        System.out.println("Enter a number");
//        int n = input.nextInt();
//        System.out.println("The factors of "+n+ " are:");
//        for (int i=1;i<=n;i++){
//            if(n % i == 0){
//                System.out.println(i + "");
//            }
//        }


//  Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
//        System.out.println("Enter numbers");
//        int n;
//        int sum = 0;
//        while ((n=input.nextInt()) > 0){
//            sum += n;
//        }
//        System.out.println("The sum of all the integers except zero is: "+sum);


//  Take integer inputs till the user enters 0 and print the largest number from all
//        System.out.println("Enter numbers");
//        int n;
//        int val = 0;
//        while ((n=input.nextInt()) > 0){
//            if (n>val) {
//                val = n;
//            }
//        }
//        System.out.println("The largest number is: "+val);

//        Addition Of Two Numbers
        System.out.println("Enter two numbers:");
        int no1 = input.nextInt();
        int no2 = input.nextInt();
        int add = no1+no2;
        System.out.println("The addition of "+no1+ " and "+no2+ " is "+add);
    }
}
