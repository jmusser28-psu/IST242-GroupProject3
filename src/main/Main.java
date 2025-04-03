package main;

import scientists.ScientistManager;
import java.util.Scanner;
import utility.ByteValidation;
import utility.PrintMenu;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ByteValidation bv = new ByteValidation();
        PrintMenu pm = new PrintMenu();

        ScientistManager scientistManager = new ScientistManager();

        scientistManager.readScientistData(scientistManager);

        pm.mainMenu(scientistManager, bv, scnr);

    }
}
