import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        int ans = oddeven(a);
    }

    private static int oddeven(int a ) {
        if (a%2 == 0){
            System.out.println("The number is even");
        }else System.out.println("The number is odd");
        return a;
    }

}
