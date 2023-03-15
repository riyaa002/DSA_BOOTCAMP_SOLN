//Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered
import java.util.Scanner;
public class MArks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks out of 100");
        int mark = in.nextInt();
        marks(mark);
    }

    private static void marks(int mark) {
       if(mark>90) System.out.println("Your grade is AA");
       if(mark>=80 && mark<90) System.out.println("Your grade is AB");
       if(mark>=70 && mark<80) System.out.println("Your grade is BB");
       if(mark>=60 && mark<70) System.out.println("Your grade is BC");
       if(mark>=50 && mark<60) System.out.println("Your grade is CD");
       if(mark>=40 && mark<50) System.out.println("Your grade is DD");
       if(mark<40) System.out.println("you failed.");
    }
}
