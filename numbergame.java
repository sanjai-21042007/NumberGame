
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            int score = 100;

            System.out.println("=== NUMBER GUESSING GAME ===");
            System.out.println("Guess a number between 1 and 100.");
            System.out.println("You have 7 attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number!");
                    score = Math.max(10, 100 - (attempts - 1) * 10);
                    System.out.println("Your score: " + score);
                    break;
                } else if (guess < number) {
                    System.out.println("Too low! Try higher.");
                } else {
                    System.out.println("Too high! Try lower.");
                }

                System.out.println("Attempts remaining: "
                        + (maxAttempts - attempts));
            }

            if (attempts == maxAttempts) {
                System.out.println("Game over! The number was " + number);
                System.out.println("Your score: 0");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
