package utility;

import java.util.Scanner;

public class ByteValidation {
    protected static Scanner scnr = new Scanner(System.in);
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
