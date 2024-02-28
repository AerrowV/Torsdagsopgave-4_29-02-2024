import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){

        // Create a Scanner object       
        Scanner scan = new Scanner(System.in); 


        // Check if the input is numeric using hasNextDouble
        if(scan.hasNextDouble()) {
            // Read user input
            double input = scan.nextDouble();


        // if so...
            if (input == (int) input) {
                int guess = (int) input;

        //   Compare it with the random number
                if (guess == rnd_number) {
                //   Let the user know the result of the comparison
                    System.out.println("YOU WIN! loser...");


                } else {

                    if (guess < rnd_number) {
                        System.out.println("YOU LOSER! HAHAHAHA THAT GUESS IS TOO LOW!!!");

                    } else {
                        System.out.println("YOU LOSER! HAHAHAHA THAT GUESS IS TOO HIGH!!!");

                    }

                    makeAGuess();
                }

            } else {

        //   Let the user try again by calling this method recursively
                System.out.println("Please enter a whole number.");
                makeAGuess();
            }

        // if input was not numeric show an error message and call this method recursively
        } else {
            System.out.println("That is not a real number... DUMBASS!!!");
            scan.nextLine();
            makeAGuess();
        }



    }


}