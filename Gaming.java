
import java.util.Random;
import java.util.Scanner;
public class Gaming {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Random number is: " + randomNumber);
         int tryCount = 0;
        while (true) {
            System.out.println("Enter your guess (1-100):");
            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) 
            {
                System.out.println("Correct! You won");
                System.out.println("it took toy " + tryCount +"tries ");
                break;
            }
            else if (playerGuess > randomNumber) 
            {
                System.out.println("More than guessed number! Guess again.");
            } 
            else 
            {
                System.out.println("Lower than guessed number! Guess again.");
            }
        }

    }


}