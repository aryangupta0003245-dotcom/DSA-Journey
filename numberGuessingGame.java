package collegeassignmentpractice;
import java.util.Scanner;
public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 10");
int cg = (int)(Math.random()*10+1),g;
do {
    System.out.print("Enter your guess : ");
    g = sc.nextInt();
    if (cg == g)
        System.out.println("Good guess!");
     else if (g > cg)
        System.out.println("Too high, try again.");
     else
        System.out.println("Too low, try again.");
}while (g!=cg);
    }
}
