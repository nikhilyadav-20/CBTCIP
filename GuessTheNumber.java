import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);

        while (!guessed) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high. Try again.");
            } else {
                guessed = true;
                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly!");
                System.out.println("Number of attempts: " + attempts);
            }
        }

        scanner.close();
    }
}
