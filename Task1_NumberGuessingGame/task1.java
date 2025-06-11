import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = 50; // Fixed number for testing
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessedCorrectly = false;

            System.out.println("\nGuess a number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess;

                if (sc.hasNextInt()) {
                    userGuess = sc.nextInt();
                    attempts++;

                    if (userGuess == numberToGuess) {
                        System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                        score++;
                        guessedCorrectly = true;
                        break;
                    } else if (userGuess < numberToGuess) {
                        System.out.println("Too low!");
                    } else {
                        System.out.println("Too high!");
                    }

                    System.out.println("Attempts left: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next(); // Clear invalid input
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You lost. The correct number was: " + numberToGuess);
            }

            sc.nextLine(); // Clear buffer
            System.out.print("Do you want to play again? (yes/no): ");
            String choice = sc.nextLine();
            playAgain = choice.equalsIgnoreCase("yes");
        }

        System.out.println("\nGame Over. Total score: " + score);
        System.out.println("Thank you for playing.");
        sc.close();
    }
}
