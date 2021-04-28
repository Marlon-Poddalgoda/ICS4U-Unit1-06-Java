import java.util.Scanner;
import java.util.Random;
/**
 * This program generates a random number and outputs to the console.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-04-28
 */

public final class DiceRoll {
    private DiceRoll() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method generates a random number.
    * @param maxValue This value is for setting the range of the random numbers.
    */
    public static void rollDie(final int maxValue) {
        // random number variable
        Random rand = new Random();
        //generate random values
        int answer = rand.nextInt(maxValue);

        // print value
        System.out.println("");
        System.out.println(answer);
    }

    /**
    * This method takes in user input and passes to the procedure.
    * @param args
    */
    public static void main(final String[] args) {

        // Create new Scanner-type variable
        Scanner maxInput = new Scanner(System.in);

        // Variables
        int maxValue;

        // program information
        System.out.println("This program outputs a random number to the "
            + "console.");
        System.out.println();

        // Asks user to enter a range value
        System.out.print("How high do you want the number "
                        + "range to be (0 to ?): ");

        while (true) {
            // check if input is an integer
            while (!maxInput.hasNextInt()) {
                System.out.println("That's not a number!");
                System.out.print("How high do you want the number "
                                + "range to be (0 to ?): ");
                maxInput.next(); // moves scanner until correct value
            }
            maxValue = maxInput.nextInt();

            // check if input is positive
            if (maxValue <= 0) {
                System.out.println("Please enter a positive number.");
                System.out.print("How high do you want the number "
                                + "range to be (0 to ?): ");
                continue;
            }

            // call procedure
            rollDie(maxValue);

            System.out.println("");
            System.out.println("Done.");
            break;
        }
    }
}
