package scientists;

import utility.ByteValidation;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ScientistManager {
    // Declares arraylists for the various scientists
    private ArrayList<Scientist> scientists = null;
    private ArrayList<Logician> logicians = null;
    private ArrayList<Mathematician> mathematicians = null;
    private ArrayList<Philosopher> philosophers = null;

    // Constructs the arraylists used by a ScientistManager
    public ScientistManager() {
        scientists = new ArrayList<>();
        logicians = new ArrayList<>();
        mathematicians = new ArrayList<>();
        philosophers = new ArrayList<>();
    }

    // Adds a scientist to the scientist arraylist
    public void addScientist(String name, String fieldOfWork, String activeYears, String awards) {
        scientists.add(new Scientist(name, fieldOfWork, activeYears, awards));
    }
    // Adds a logician to the logicians arraylist
    // Adds a logician to the scientist arraylist
    public void addLogician(String name, String fieldOfWork, String activeYears, String awards, String profession,
                            String journalArticles, String bookPublications) {
        logicians.add(new Logician(name, fieldOfWork, activeYears, awards, profession, journalArticles, bookPublications));
        addScientist(name, fieldOfWork, activeYears, awards);
    }

    // Adds a mathematician to the mathematicians arraylist
    // Adds a mathematician to the scientist arraylist
    public void addMathematician(String name, String fieldOfWork, String activeYears, String awards, String profession,
                            String journalArticles, String bookPublications) {
        mathematicians.add(new Mathematician(name, fieldOfWork, activeYears, awards, profession, journalArticles, bookPublications));
        addScientist(name, fieldOfWork, activeYears, awards);
    }

    // Adds a philosopher to the philosophers arraylist
    // Adds a philosopher to the scientist arraylist
    public void addPhilosopher(String name, String fieldOfWork, String activeYears, String awards, String profession,
                                 String journalArticles, String bookPublications) {
        philosophers.add(new Philosopher(name, fieldOfWork, activeYears, awards, profession, journalArticles, bookPublications));
        addScientist(name, fieldOfWork, activeYears, awards);
    }

    // Removes a scientist from the scientist arraylist and the arraylist of their profession
    // Removes the scientist from the respective profession by iterating through all the specific profession arraylists
    // and removes the scientist if there is a match
    public void removeScientist() {
        ByteValidation bv = new ByteValidation();

        byte choice = 0;
        Scanner scnr = new Scanner(System.in);
        listScientists();
        System.out.print("Who would you like to remove (Number associated with Scientist): ");
        choice = bv.validate();
        // Converts user readable input to a valid index
        choice -= 1;
        String scientist = scientists.get(choice).getName();
        scientists.remove(choice);
        for (int i = 0; i < logicians.size(); i++) {
            String logician = logicians.get(i).getName();
            if (scientist.equals(logician)) {
                logicians.remove(i);
            }
        }
        for (int i = 0; i < mathematicians.size(); i++) {
            String mathematican = mathematicians.get(i).getName();
            if (scientist.equals(mathematican)) {
                mathematicians.remove(i);
            }
        }
        for (int i = 0; i < philosophers.size(); i++) {
            String philosopher = philosophers.get(i).getName();
            if (scientist.equals(philosopher)) {
                philosophers.remove(i);
            }
        }

    }

    // Lists all scientists with their basic info
    public void listScientists() {
        for (int i = 0; i < scientists.size(); i++) {
            System.out.printf("Scientists %d: %s\n", (i + 1), scientists.get(i).getInfo("Basic"));
        }
    }

    // Lists all mathematicians with their basic info
    public void listMathematicians() {
        for (int i = 0; i < mathematicians.size(); i++) {
            System.out.printf("Mathematician %d: %s\n", (i + 1), mathematicians.get(i).getInfo("Basic"));
        }
    }

    // Lists all philosophers with their basic info
    public void listPhilosophers() {
        for (int i = 0; i < philosophers.size(); i++) {
            System.out.printf("Philosopher %d: %s\n", (i + 1), philosophers.get(i).getInfo("Basic"));
        }
    }

    // Lists all logicians with their basic info
    public void listLogicians() {
        for (int i = 0; i < logicians.size(); i++) {
            System.out.printf("Logician %d: %s\n", (i + 1), logicians.get(i).getInfo("Basic"));
        }
    }

    // Lists all scientists by their profession
    public void getScientistsByProfession() {
        for (int i = 0; i < mathematicians.size(); i++) {
            System.out.println(mathematicians.get(i).getInfo("By Profession"));
        }
        for (int i = 0; i < philosophers.size(); i++) {
            System.out.println(philosophers.get(i).getInfo("By Profession"));
        }
        for (int i = 0; i < logicians.size(); i++) {
            System.out.println(logicians.get(i).getInfo("By Profession"));
        }
    }

    // Lists all scientists by their field of work
    public void getScientistsByField() {
        for (int i = 0; i < mathematicians.size(); i++) {
            System.out.println(mathematicians.get(i).getInfo("By Field of Work"));
        }
        for (int i = 0; i < philosophers.size(); i++) {
            System.out.println(philosophers.get(i).getInfo("By Field of Work"));
        }
        for (int i = 0; i < logicians.size(); i++) {
            System.out.println(logicians.get(i).getInfo("By Field of Work"));
        }
    }

    // Outputs the final specific arraylists (mathematician, logician, philosopher) to the file,
    // formatted in the same way as the original CSV file was
    public void printScientistsFile() {
        FileWriter fw = null;
        BufferedWriter writer = null;
        try {
            fw = new FileWriter("scientistdata.csv");
            writer = new BufferedWriter(fw);

            writer.write("Name,Profession,Field of Work,Active Years,Awards,Journal Articles,Book Publications\n");

            for (int i = 0; i < mathematicians.size(); i++) {
                String line = mathematicians.get(i).getName() + ","
                        + mathematicians.get(i).getProfession() + ","
                        + mathematicians.get(i).getFieldOfWork() + ","
                        + mathematicians.get(i).getActiveYears() + ","
                        + mathematicians.get(i).getAwards() + ","
                        + mathematicians.get(i).getJournalArticles() + ","
                        + mathematicians.get(i).getBookPublications() + "\n";

                writer.write(line);
            }

            for (int i = 0; i < philosophers.size(); i++) {
                String line = philosophers.get(i).getName() + ","
                        + philosophers.get(i).getProfession() + ","
                        + philosophers.get(i).getFieldOfWork() + ","
                        + philosophers.get(i).getActiveYears() + ","
                        + philosophers.get(i).getAwards() + ","
                        + philosophers.get(i).getJournalArticles() + ","
                        + philosophers.get(i).getBookPublications() + "\n";

                writer.write(line);
            }

            for (int i = 0; i < logicians.size(); i++) {
                String line = logicians.get(i).getName() + ","
                        + logicians.get(i).getProfession() + ","
                        + logicians.get(i).getFieldOfWork() + ","
                        + logicians.get(i).getActiveYears() + ","
                        + logicians.get(i).getAwards() + ","
                        + logicians.get(i).getJournalArticles() + ","
                        + logicians.get(i).getBookPublications() + "\n";

                writer.write(line);
            }

            writer.close();

        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

    // Reads the CSV file and adds the scientists to the scientist arraylist and their respective profession arraylist
    public void readScientistData(ScientistManager scientistManager) {
        FileReader scientists = null;
        BufferedReader reader = null;

        try {
            String fileName = "scientistdata.csv";
            scientists = new FileReader(fileName);
            reader = new BufferedReader(scientists);
            String personInfo = "";
            while ((personInfo = reader.readLine()) != null) {
                // Checks if the line is not the first line of the CSV file
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

            reader.close();
        }

        catch (IOException e) {
            System.err.println("Error Occurred: " + e.getMessage());
        }
    }

}
