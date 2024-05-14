import java.util.Scanner;

/**
 * numberGuessingGame
 */
public class numberGuessingGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 5,guess;
        System.out.println("Welcome to the number guessing game");
        do{
            System.out.print("Please guess the number between 0 to 10");
            guess = in.nextInt();
        }while(num!=guess);
        System.out.println("You have succesfully guessed the number");
    }
}