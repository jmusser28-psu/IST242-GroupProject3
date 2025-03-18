package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "scientistdata.csv";
        FileReader scientists = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(scientists);
        Scanner scnr = new Scanner(System.in);

        ScientistManager scientistManager = new ScientistManager();

        ArrayList<String> mathematician = new ArrayList<>();
        ArrayList<String> philosopher = new ArrayList<>();
        ArrayList<String> logician = new ArrayList<>();

        boolean run = true;
        byte userChoice = 0;
//        while (run) {
//            System.out.println("---Scientists---");
//            System.out.println("0.) Exit");
//            System.out.println("1.) Option 1");
//            System.out.println("2.) Option 2");
//            System.out.println("3.) Option 3");
//            userChoice = scnr.nextByte();
//            if (userChoice == 0) {
//                run = false;
//            }
//            else if (userChoice == 1) {
//
//            }
//            else if (userChoice == 2) {
//
//            }
//            else if (userChoice == 3) {
//
//            }
//            else {
//                System.out.printf("Invalid choice %d\n", userChoice);
//            }
//        }

        String personInfo = "";
        while ((personInfo = reader.readLine()) != null) {
            String[] scientistInfo = personInfo.split(",");

            String name = scientistInfo[0];
            String profession = scientistInfo[1];
            String fieldOfWork = scientistInfo[2];
            String activeYears = scientistInfo[3];
            String awards = scientistInfo[4];
            String journalArticles = scientistInfo[5];
            String bookPublications = scientistInfo[6];

            if (profession.equalsIgnoreCase("Mathematician")) {
                scientistManager.addScientist(name, fieldOfWork, activeYears,awards);
            }
            if (profession.equalsIgnoreCase("Philosopher")) {
                scientistManager.addScientist(name, fieldOfWork, activeYears,awards);
            }
            if (profession.equalsIgnoreCase("Logician")) {
                scientistManager.addLogician(name, fieldOfWork, activeYears, awards, profession, journalArticles, bookPublications);
            }
        }

        scientistManager.listScientists();
        System.out.println("----------------------");
        scientistManager.listLogicians();
    }
}
