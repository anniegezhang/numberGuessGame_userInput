import java.util.Random;
import java.util.Scanner;

import static java.lang.String.valueOf;

class Main {
    public static <Int> void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        System.out.println("Welcome to the game " + userName + "!");
        // Output user input


        Random rand = new Random(); //instance of random class
        int upperbound = 10;
        //generate random values from 0-1000
        int int_random = rand.nextInt(upperbound);
        System.out.println("We have generated a random number for you " + userName + "!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your guess:");

        Scanner myObj1 = new Scanner(System.in);
        String guessInput = myObj.nextLine();

        String showMe = "show me";

        while (! guessInput.equals(valueOf(int_random)) && ! guessInput.equals("show me")) {
            System.out.println("Sorry! " + userName + " You could either try again or type " +
                    "\"show me\" to see the correct number ");
            guessInput = myObj.nextLine();
        }
        if (guessInput.equals(showMe)) {
            System.out.println("The number is " + int_random);
            System.out.println("Game ends ");
        }
        else {
            System.out.println("Congratulations! " + userName + " You got it! ");
            System.out.println("Game ends ");
        }
    }
}
