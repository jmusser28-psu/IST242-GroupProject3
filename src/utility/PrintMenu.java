package utility;

import scientists.ScientistManager;

import java.util.Scanner;

public class PrintMenu {
    // Prints the menu that the user interacts with
    public static void mainMenu(ScientistManager scientistManager, ByteValidation bv, Scanner scnr) {
        boolean run = true;
        byte userChoice = 0;
        // Keep the loop running until the user is finished
        while (run) {
            System.out.println("---Scientists---");
            System.out.println("0.) Exit");
            System.out.println("1.) List Scientists");
            System.out.println("2.) Add Scientists");
            System.out.println("3.) Remove Scientists");
            System.out.print("Please enter a choice (0-3): ");
            userChoice = bv.validate();
            // End the loop, and print the updated information to the CSV file
            if (userChoice == 0) {
                run = false;
                scientistManager.printScientistsFile();
            }

            // Passes scientistManager and bv (byteValidate) to the listScientists method of this class
            // so the user can request the lists of scientists by organizations
            else if (userChoice == 1) {
                listScientists(scientistManager, bv);
            }

            // Passes scientistManager and bv to the addScientists method of this class
            else if (userChoice == 2) {
                addScientists(scientistManager, bv, scnr);
            }

            // Calls the removeScientist method of scientistManager
            // This is done so that the arraylists can be modified
            else if (userChoice == 3) {
                scientistManager.removeScientist();
            }

            // Prints an invalid choice
            else {
                System.out.printf("Invalid choice: %d\n", userChoice);
            }
        }
    }

    // Lists the scientists by different organizations
    // Option 1, 5, and 6 were required for this project.
    // Option 1 is names and active years
    // Option 5 is the list of scientists by their profession, field of work, and awards
    // Option 6 is the list of scientists by their field of work, awards, journals, and book publications
    // Options 5 and 6 also include the names of the scientists so that they can be identified easily
    // Options 2, 3, and 4 were not required for this project but made sense to include.
    // Options 2, 3, and 4 just print the basic information for the scientists in specific professions
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

            // Declares the variables needed to create a new scientist
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

            // Gathers info needed to create a mathematician
            // Creates a new mathematician
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

            // Gathers info needed to create a philosopher
            // Creates a new philosopher
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

            // Gathers info needed to create a logician
            // Creates a new logician
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
