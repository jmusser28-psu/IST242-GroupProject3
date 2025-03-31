package scientists;

import java.util.ArrayList;
import java.util.Scanner;

public class ScientistManager {
    private ArrayList<Scientist> scientists = null;
    private ArrayList<Logician> logicians = null;
    private ArrayList<Mathematician> mathematicians = null;
    private ArrayList<Philosopher> philosophers = null;

    public ScientistManager() {
        scientists = new ArrayList<>();
        logicians = new ArrayList<>();
        mathematicians = new ArrayList<>();
        philosophers = new ArrayList<>();
    }

    public void addScientist(String name, String fieldOfWork, String activeYears, String awards) {
        scientists.add(new Scientist(name, fieldOfWork, activeYears, awards));
    }
    public void addLogician(String name, String fieldOfWork, String activeYears, String awards, String profession,
                            String journalArticles, String bookPublications) {
        logicians.add(new Logician(name, fieldOfWork, activeYears, awards, profession, journalArticles, bookPublications));
        addScientist(name, fieldOfWork, activeYears, awards);
    }

    public void addMathematician(String name, String fieldOfWork, String activeYears, String awards, String profession,
                            String journalArticles, String bookPublications) {
        mathematicians.add(new Mathematician(name, fieldOfWork, activeYears, awards, profession, journalArticles, bookPublications));
        addScientist(name, fieldOfWork, activeYears, awards);
    }

    public void addPhilosopher(String name, String fieldOfWork, String activeYears, String awards, String profession,
                                 String journalArticles, String bookPublications) {
        philosophers.add(new Philosopher(name, fieldOfWork, activeYears, awards, profession, journalArticles, bookPublications));
        addScientist(name, fieldOfWork, activeYears, awards);
    }

    public void removeScientist() {
        byte choice = 0;
        Scanner scnr = new Scanner(System.in);
        listScientists();
        System.out.print("Who would you like to remove (Number associated with Scientist): ");
        choice = scnr.nextByte();
        scnr.nextLine();
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

    public void listScientists() {
        for (int i = 0; i < scientists.size(); i++) {
            System.out.printf("Scientists %d: %s\n", (i + 1), scientists.get(i).getInfo("Basic"));
        }
    }

    public void listMathematicians() {
        for (int i = 0; i < mathematicians.size(); i++) {
            System.out.printf("Mathematician %d: %s\n", (i + 1), mathematicians.get(i).getInfo("Basic"));
        }
    }
    public void listPhilosophers() {
        for (int i = 0; i < philosophers.size(); i++) {
            System.out.printf("Philosopher %d: %s\n", (i + 1), philosophers.get(i).getInfo("Basic"));
        }
    }
    public void listLogicians() {
        for (int i = 0; i < logicians.size(); i++) {
            System.out.printf("Logician %d: %s\n", (i + 1), logicians.get(i).getInfo("Basic"));
        }
    }
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
}
