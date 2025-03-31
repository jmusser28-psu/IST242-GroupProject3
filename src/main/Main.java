package main;

import scientists.ScientistManager;

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

        String personInfo = "";
        while ((personInfo = reader.readLine()) != null) {
            if (!personInfo.contains("Name")) {
                String[] scientistInfo = personInfo.split(",");
                String name = scientistInfo[0];
                String profession = scientistInfo[1];
                String fieldOfWork = scientistInfo[2];
                String activeYears = scientistInfo[3];
                String awards = scientistInfo[4];
                String journalArticles = scientistInfo[5];
                String bookPublications = scientistInfo[6];

                if (profession.equalsIgnoreCase("Mathematician")) {
                    scientistManager.addMathematician(name, profession, activeYears, awards, fieldOfWork, journalArticles, bookPublications);
                }
                if (profession.equalsIgnoreCase("Philosopher")) {
                    scientistManager.addPhilosopher(name, profession, activeYears, awards, fieldOfWork, journalArticles, bookPublications);
                }
                if (profession.equalsIgnoreCase("Logician")) {
                    scientistManager.addLogician(name, profession, activeYears, awards, fieldOfWork, journalArticles, bookPublications);
                }
            }
        }

        boolean run = true;
        byte userChoice = 0;
        while (run) {
            System.out.println("---Scientists---");
            System.out.println("0.) Exit");
            System.out.println("1.) List Scientists");
            System.out.println("2.) Add Scientists");
            System.out.println("3.) Remove Scientists");
            System.out.print("Choice? ");
            userChoice = scnr.nextByte();
            scnr.nextLine();
            if (userChoice == 0) {
                run = false;
            }
            else if (userChoice == 1) {
                boolean loopRun = true;
                while (loopRun) {
                    System.out.println("0.) Exit");
                    System.out.println("1.) List All Scientists");
                    System.out.println("2.) List Mathematicians");
                    System.out.println("3.) List Philosophers");
                    System.out.println("4.) List Logicians");
                    System.out.print("Choice? ");
                    userChoice = scnr.nextByte();
                    scnr.nextLine();
                    if (userChoice == 0) {
                        loopRun = false;
                    }
                    else if (userChoice == 1) {
                        scientistManager.listScientists();
                    }
                    else if (userChoice == 2) {
                        scientistManager.listMathematicians();
                    }
                    else if (userChoice == 3) {
                        scientistManager.listPhilosophers();
                    }
                    else if (userChoice == 4) {
                        scientistManager.listLogicians();
                    }
                    else {
                        System.out.printf("Invalid choice: %d\n", userChoice);
                    }
                }
            }
            else if (userChoice == 2) {
                boolean loopRun = true;
                while (loopRun) {
                    String name = "";
                    String fieldOfWork = "";
                    String activeYears = "";
                    String awards = "";
                    String profession = "";
                    String journalArticles = "";
                    String bookPublications = "";

                    System.out.println("0.) Exit");
                    System.out.println("1.) Add Mathematician");
                    System.out.println("2.) Add Philosopher");
                    System.out.println("3.) Add Logician");
                    System.out.print("Choice? ");
                    userChoice = scnr.nextByte();
                    scnr.nextLine();

                    if (userChoice == 0) {
                        loopRun = false;
                    }

                    else if (userChoice == 1) {
                        System.out.print("Enter a name: ");
                        name = scnr.nextLine();
                        System.out.print("Enter a field of work: ");
                        fieldOfWork = scnr.nextLine();
                        System.out.print("Enter active years (start year - end year): ");
                        activeYears = scnr.nextLine();
                        System.out.print("Enter awards: ");
                        awards = scnr.nextLine();
                        profession = "Mathematician";
                        System.out.print("Enter number of articles: ");
                        journalArticles = scnr.nextLine();
                        System.out.print("Enter number of book publications: ");
                        bookPublications = scnr.nextLine();

                        scientistManager.addMathematician(name, fieldOfWork,
                                activeYears, awards, profession, journalArticles, bookPublications);
                    }

                    else if (userChoice == 2) {
                        System.out.print("Enter a name: ");
                        name = scnr.nextLine();
                        System.out.print("Enter a field of work: ");
                        fieldOfWork = scnr.nextLine();
                        System.out.print("Enter active years (start year - end year): ");
                        activeYears = scnr.nextLine();
                        System.out.print("Enter awards: ");
                        awards = scnr.nextLine();
                        profession = "Philosopher";
                        System.out.print("Enter number of articles: ");
                        journalArticles = scnr.nextLine();
                        System.out.print("Enter number of book publications: ");
                        bookPublications = scnr.nextLine();

                        scientistManager.addPhilosopher(name, fieldOfWork,
                                activeYears, awards, profession, journalArticles, bookPublications);
                    }

                    else if (userChoice == 3) {
                        System.out.print("Enter a name: ");
                        name = scnr.nextLine();
                        System.out.print("Enter a field of work: ");
                        fieldOfWork = scnr.nextLine();
                        System.out.print("Enter active years (start year - end year): ");
                        activeYears = scnr.nextLine();
                        System.out.print("Enter awards: ");
                        awards = scnr.nextLine();
                        profession = "Logician";
                        System.out.print("Enter number of articles: ");
                        journalArticles = scnr.nextLine();
                        System.out.print("Enter number of book publications: ");
                        bookPublications = scnr.nextLine();

                        scientistManager.addLogician(name, fieldOfWork,
                                activeYears, awards, profession, journalArticles, bookPublications);
                    }
                }
            }
            else if (userChoice == 3) {
                scientistManager.removeScientist();
            }
            else {
                System.out.printf("Invalid choice %d\n", userChoice);
            }
        }

    }
}
