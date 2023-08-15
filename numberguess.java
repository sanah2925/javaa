import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;  // Minimum number in the range
        int maxRange = 100;  // Maximum number in the range
        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        int maxAttempts = 3; // Maximum number of attempts allowed
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a number between " + minRange + " and " + maxRange + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number. Good luck!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                scanner.close();
                return;
            }
        }

        System.out.println("Sorry, you have exceeded the maximum number of attempts.");
        System.out.println("The secret number was: " + secretNumber);

        scanner.close();
    }
}
