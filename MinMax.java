import java.util.Scanner;

public class MinMax {
//    Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
    //----------------no return value------------
//    public static void main(String[] args) {
//        max(3,6,1);
//        min(4,7,0);
//
//    }
//    static void max(int a,int b, int c){
//        if (a>b && a>c){
//            System.out.println(a+" is maximum");
//        } else if (b>a && b>c) {
//            System.out.println(b+" is maximum");
//        }else System.out.println(c+" is maximum");
//
//    }
//    static void min(int a,int b, int c){
//        if (a<b && a<c){
//            System.out.println(a+" is Minimum");
//        } else if (b<a && b<c) {
//            System.out.println(b+" is Minimum");
//        }else System.out.println(c+" is Minimum");
//
//    }

    //---------return value------------
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        int maximum = max(n1,n2,n3);
        int minimum = min(n1,n2,n3);
        System.out.println("The maximum of "+n1+" "+n2+" "+n3+" is "+maximum);
        System.out.println("The minimum of "+n1+" "+n2+" "+n3+" is "+minimum);

    }

    private static int min(int n1, int n2, int n3) {
        int min = n1;
        if (n2 <min){
            min = n2;
        } else if (n3<min) {
            min = n3;
        }
        return min;
    }

    public static int max(int n1, int n2, int n3){
        int max = n1;
        if (n2 >max){
            max = n2;
        } else if (n3>max) {
            max = n3;
        }
        return max;
    }


}
