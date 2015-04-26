/**
* @author Anna Rafferty
* @author Charlie, Jonah, Holden
*
*/
import java.util.Random;

public class GuessingGame {
    //Instance variable storing the number the user is guessing
    private int number;
    
    //Static variable storing the default number to have the user guess.
    private static int defaultNumber = 27;
    /**
     * Constructs a new GuessingGame. To start game,
     * you must call startNewGame(). Otherwise, the number to guess will always
     * have a default value.
     */
    public GuessingGame() {
        number = defaultNumber;
    }
	
    /**
     * Returns the number the user is supposed to guess.
     * @return
     */
    public int getNumber() {
        return number;
    }
	
	
    /**
     * Returns the default number for guessing (if player tries to play without starting a new game).
     * @return
     */
    public static int getDefaultNumber() {
        return defaultNumber;
    }
	
    /**
     * Changes the default number for guessing. This number is used if the player tries to play
     * without calling startNewGame().
     * @param defaultNumber
     */
    public static void changeDefaultNumber(int defaultNumber) {
        GuessingGame.defaultNumber = defaultNumber;//What happens if you don't include "GuessingGame."? Make sure you understand why.
    }
	
    /**
     * Starts a new guessing game by randomly selecting an integer between 1 and 100 for the
     * player to guess.
     */
    public void startNewGame() {
        number = (int) Math.ceil(Math.random()*100);
    }
	
	
    /**
     * Plays a guessing game by having the player
     * guess until she correctly identifies the computer's number. userInput
     * should be a scanner that gets input from the keyboard. 
     */
    public void playGame() {
        /* IMPLEMENT - YOUR CODE GOES HERE */
        System.err.println("Sorry, playGame() hasn't been programmed.");
    }
	
    /**
     * GuessingGame main constructs a new game and has the player play a single game in which
     * she must guess the computer's chosen number (from 1-100).
     * @param args
     */
    public static void main(String[] args) {
        GuessingGame.startNewGame();
    }
}