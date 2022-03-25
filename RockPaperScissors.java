
/**
 * play a game of rock, paper scissors against code
 * 
 * Author Andrew Du-frigstad
 * version 1
 * since 2022-03-24
 */

// imports
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static String findResult(String computerGuess, String userGuessLower) {

        // declaring variables
        String result = "";

        if (computerGuess == userGuessLower) {
            // give the user a choice if they want to repeat
            result = "Tie!";
            if (computerGuess == "rock" && userGuessLower == "paper") {
                result = "You win!";
            } else if (computerGuess == "paper" && userGuessLower == "scissors") {
                result = "You win!";
            } else if (computerGuess == "scissors" && userGuessLower == "rock") {
                result = "You win!";
            } else {
                result = "You lose...";
            }
        }
        // returning the result (string)
        return result;
    }
    public static void main(String[] args) {
        // declaring variables and generating random number
        int min = 1;
        int max = 3;
        int computerNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String computerGuess = "";
        String userGuess = "";
        String userGuessLower = "";

        Scanner myObj = new Scanner(System.in);


        // making the random number into a guess
        if (computerNum == 1) {
            computerGuess = "rock";
        } else if (computerNum == 2) {
            computerGuess = "paper";
        } else {
            computerGuess = "scissors";
        }

        // if statement to make sure the user inputs the right thing
        while (userGuessLower != "rock" || userGuessLower != "paper" || userGuessLower != "scissors") {
            System.out.println("choose either rock, paper or scissors");
            userGuess = myObj.nextLine();
            userGuessLower = userGuess.toLowerCase();

            if (userGuessLower == "rock" || userGuessLower == "paper" || userGuessLower == "scissors") {
                break;
            }
        } 

        findResult(computerGuess, userGuessLower);

        String result = findResult(computerGuess, userGuessLower);
        System.out.println(result);
    }
}
