package utility;

import java.util.Scanner;

public class ByteValidation {
    protected static Scanner scnr = new Scanner(System.in);

    // Takes in user input and determines if it is a byte value, if it is not clear the buffer and display an error
    // message saying that the input is invalid.
    // Succeeds when the user enters a valid byte value.
    // Here so that the program does not crash on an unexpected input.
    public byte validate() {
        byte byteValue = 0;
        boolean valid = false;
        while (!valid) {
            if (scnr.hasNextByte()) {
                byteValue = scnr.nextByte();
                scnr.nextLine();
                valid = true;
            }
            else {
                System.out.printf("Invalid input: %s\n", scnr.nextLine());
                System.out.print("Please enter a valid number: ");
            }
        }

        return byteValue;
    }

}
