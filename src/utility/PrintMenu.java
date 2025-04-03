package utility;

import scientists.ScientistManager;

import java.util.Scanner;

public class PrintMenu {
    public static void mainMenu(ScientistManager scientistManager, ByteValidation bv, Scanner scnr) {
        boolean run = true;
        byte userChoice = 0;
        while (run) {
            System.out.println("---Scientists---");
            System.out.println("0.) Exit");
            System.out.println("1.) List Scientists");
            System.out.println("2.) Add Scientists");
            System.out.println("3.) Remove Scientists");
            System.out.print("Please enter a choice (0-3): ");
            userChoice = bv.validate();
            if (userChoice == 0) {
                run = false;
                scientistManager.printScientistsFile();
            }
            else if (userChoice == 1) {
                listScientists(scientistManager, bv);
            }
            else if (userChoice == 2) {
                addScientists(scientistManager, bv, scnr);
            }
            else if (userChoice == 3) {
                scientistManager.removeScientist();
            }
            else {
                System.out.printf("Invalid choice %d\n", userChoice);
            }
        }
    }
    public static void listScientists(ScientistManager scientistManager, ByteValidation bv) {
        byte userChoice = 0;
        boolean loopRun = true;

        while (loopRun) {
            System.out.println("0.) Exit");
            System.out.println("1.) List All Scientists");
            System.out.println("2.) List Mathematicians");
            System.out.println("3.) List Philosophers");
            System.out.println("4.) List Logicians");
            System.out.println("5.) List by Profession");
            System.out.println("6.) List by Field of Work");
            System.out.print("Please enter a choice (0-6): ");
            userChoice = bv.validate();
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
            else if (userChoice == 5) {
                scientistManager.getScientistsByProfession();
            }
            else if (userChoice == 6) {
                scientistManager.getScientistsByField();
            }
            else {
                System.out.printf("Invalid choice: %d\n", userChoice);
            }
        }
    }


    public static void addScientists(ScientistManager scientistManager, ByteValidation bv, Scanner scnr) {
        boolean loopRun = true;
        while (loopRun) {
            byte userChoice = 0;
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
            userChoice = bv.validate();

            if (userChoice == 0) {
                loopRun = false;
            }

            else if (userChoice == 1) {
                System.out.print("Enter a name: ");
                name = scnr.nextLine();
                System.out.print("Enter a field of work: ");
                fieldOfWork = scnr.nextLine();
                profession = "Mathematician";
                System.out.print("Enter active years (start year - end year): ");
                activeYears = scnr.nextLine();
                System.out.print("Enter awards: ");
                awards = scnr.nextLine();
                System.out.print("Enter number of articles: ");
                journalArticles = scnr.nextLine();
                System.out.print("Enter number of book publications: ");
                bookPublications = scnr.nextLine();

                scientistManager.addMathematician(name, profession,
                        activeYears, awards, fieldOfWork, journalArticles, bookPublications);
            }

            else if (userChoice == 2) {
                System.out.print("Enter a name: ");
                name = scnr.nextLine();
                System.out.print("Enter a field of work: ");
                fieldOfWork = scnr.nextLine();
                profession = "Mathematician";
                System.out.print("Enter active years (start year - end year): ");
                activeYears = scnr.nextLine();
                System.out.print("Enter awards: ");
                awards = scnr.nextLine();
                System.out.print("Enter number of articles: ");
                journalArticles = scnr.nextLine();
                System.out.print("Enter number of book publications: ");
                bookPublications = scnr.nextLine();

                scientistManager.addPhilosopher(name, profession,
                        activeYears, awards, fieldOfWork, journalArticles, bookPublications);
            }

            else if (userChoice == 3) {
                System.out.print("Enter a name: ");
                name = scnr.nextLine();
                System.out.print("Enter a field of work: ");
                fieldOfWork = scnr.nextLine();
                profession = "Mathematician";
                System.out.print("Enter active years (start year - end year): ");
                activeYears = scnr.nextLine();
                System.out.print("Enter awards: ");
                awards = scnr.nextLine();
                System.out.print("Enter number of articles: ");
                journalArticles = scnr.nextLine();
                System.out.print("Enter number of book publications: ");
                bookPublications = scnr.nextLine();

                scientistManager.addLogician(name, profession,
                        activeYears, awards, fieldOfWork, journalArticles, bookPublications);
            }
        }
    }
}
