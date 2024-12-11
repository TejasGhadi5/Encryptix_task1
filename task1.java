import java.util.Scanner;
import java.util.Random;

public class task1 {
    static int winCount = 0;

    public static void main(String args[]) { 
        generateRandom();
    } 

    public static void generateRandom() {
        Random rand = new Random();

       
        int randomNum = rand.nextInt(100);

       
        guess(randomNum);
    }

    public static void guess(int randomNum) {
       
        Scanner in = new Scanner(System.in);

        
        System.out.println("");
        System.out.println("Number Guessing Game");
        System.out.print("Guess a number between 0-100: ");
        int guess = in.nextInt();
        System.out.println("");

       
        while (guess < 0 || guess > 100) {
            System.out.print("Guess a number between 0-100: ");
            guess = in.nextInt();
            System.out.println("");
        }

       
        int tries = 0;
        while (guess != randomNum) {
            tries++;

            
            if (guess > randomNum) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNum) {
                System.out.println("Too low! Try again.");
            }

            System.out.print("Guess again: ");
            guess = in.nextInt();
            System.out.println("");

            
            while (guess < 0 || guess > 100) {
                System.out.print("Guess a number between 0-100: ");
                guess = in.nextInt();
                System.out.println("");
            }
        }

       
        System.out.println("Correct Answer. You Won!");
        System.out.println("Wrong Tries: " + tries);
        System.out.println("");

        
        winCount++;
        System.out.println("Total Wins: " + winCount);
        System.out.println("");

       
        System.out.println("Press 1 to Play again.");
        System.out.println("Press 0 to exit.");
        int choice = in.nextInt();

        if (choice == 1)
            generateRandom();
        else {
            System.out.println("Thank you for playing! You won a total of " + winCount + " times.");
            return;
        }
    }
}