import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        vote(age);

    }
    static void vote(int age){
        if (age>= 18){
            System.out.println("He/She can vote");
        }
        else System.out.println("He/She cannot vote");
    }
}
