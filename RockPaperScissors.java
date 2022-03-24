
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

    public static void main(String[] args) {
    // declaring variables and generating random number
    int min = 1;
    int max = 3;
    int randNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    int counter = 1;
    
    // getting user input
    Scanner myObj = new Scanner(System.in);
    System.out.println("choose either rock, paper or scissors");
    String userChoice = myObj.nextLine();
    String gfg1 = userChoice.toLowerCase();

    if (userChoice != "rock" || userChoice != "paper" ||userChoice != "scissors") {
        System.out.println("choose either rock, paper or scissors");
        userChoice = myObj.nextLine();
        gfg1 = userChoice.toLowerCase();
    }

    while (userChoice == "rock" || userChoice == "paper" ||userChoice == "scissors") {

    }
}
