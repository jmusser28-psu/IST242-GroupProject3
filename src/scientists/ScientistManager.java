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
    }

    public void addMathematician(String name, String fieldOfWork, String activeYears, String awards, String profession,
                            String journalArticles, String bookPublications) {
        mathematicians.add(new Mathematician(name, fieldOfWork, activeYears, awards, profession, journalArticles, bookPublications));
    }

    public void addPhilosopher(String name, String fieldOfWork, String activeYears, String awards, String profession,
                                 String journalArticles, String bookPublications) {
        philosophers.add(new Philosopher(name, fieldOfWork, activeYears, awards, profession, journalArticles, bookPublications));
    }

    public void removeScientist() {
        byte choice = 0;
        Scanner scnr = new Scanner(System.in);
        listScientists();
        choice = scnr.nextByte();
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
            System.out.printf("Scientists %d: %s\n", (i + 1), scientists.get(i).getBasicInfo());
        }
    }

    public void listMathematicians() {
        for (int i = 0; i < mathematicians.size(); i++) {
            System.out.printf("Mathematicians %d: %s\n", (i + 1), mathematicians.get(i).getBasicInfo());
        }
    }
    public void listPhilosophers() {
        for (int i = 0; i < philosophers.size(); i++) {
            System.out.printf("Philosophers %d: %s\n", (i + 1), philosophers.get(i).getBasicInfo());
        }
    }
    public void listLogicians() {
        for (int i = 0; i < logicians.size(); i++) {
            System.out.printf("Logicians %d: %s\n", (i + 1), logicians.get(i).getBasicInfo());
        }
    }
    public void getLogicianInfo() {
        for (int i = 0; i < logicians.size(); i++) {
            System.out.printf("Logicians %d: %s\n", (i + 1), logicians.get(i).getProfessionInfo());
        }
    }

    public void getScientists() {
        for (int i = 0; i < logicians.size(); i++) {
            String name = logicians.get(i).getName();
            String field = logicians.get(i).getFieldOfWork();
            String awards = logicians.get(i).getAwards();
            String journalArticles = logicians.get(i).getJournalArticles();
            String bookPublications = logicians.get(i).getBookPublications();
            System.out.printf("Name: %s\tField: %s\tAwards: %s\tJournal Articles: %s\tBook Publications: %s\n",
                    name, field, awards, journalArticles, bookPublications);
        }
        for (int i = 0; i < mathematicians.size(); i++) {
            String name = mathematicians.get(i).getName();
            String field = mathematicians.get(i).getFieldOfWork();
            String awards = mathematicians.get(i).getAwards();
            String journalArticles = mathematicians.get(i).getJournalArticles();
            String bookPublications = mathematicians.get(i).getBookPublications();
            System.out.printf("Name: %s\tField: %s\tAwards: %s\tJournal Articles: %s\tBook Publications: %s\n",
                    name, field, awards, journalArticles, bookPublications);
        }
        for (int i = 0; i < philosophers.size(); i++) {
            String name = philosophers.get(i).getName();
            String field = philosophers.get(i).getFieldOfWork();
            String awards = philosophers.get(i).getAwards();
            String journalArticles = philosophers.get(i).getJournalArticles();
            String bookPublications = philosophers.get(i).getBookPublications();
            System.out.printf("Name: %s\tField: %s\tAwards: %s\tJournal Articles: %s\tBook Publications: %s\n",
                    name, field, awards, journalArticles, bookPublications);
        }
    }
}
