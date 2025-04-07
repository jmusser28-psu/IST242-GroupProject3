// Please note that this project will contain an unmodified scientists.csv file
// It will be updated once the user choices to exit the program
// This is so that you can verify that the project does output to a file

package main;

import scientists.ScientistManager;
import java.util.Scanner;
import utility.ByteValidation;
import utility.PrintMenu;

public class Main {

    public static void main(String[] args) {
        // Creates Scanner, ByteValidation and PrintMenu
        // Scanner is used for user input, ByteValidation for ensuring user input does not cause crashes,
        // and printMenu for printing out the menu
        Scanner scnr = new Scanner(System.in);
        ByteValidation bv = new ByteValidation();
        PrintMenu pm = new PrintMenu();

        // Creates the ScientistManager used for manipulating scientist data
        ScientistManager scientistManager = new ScientistManager();

        // Reads the CSV file before allowing user manipulation
        scientistManager.readScientistData(scientistManager);

        // Calls the menu
        pm.mainMenu(scientistManager, bv, scnr);

    }
}
