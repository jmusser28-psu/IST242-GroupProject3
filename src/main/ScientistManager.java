package main;

import java.util.ArrayList;

public class ScientistManager {
    private ArrayList<Scientist> scientists = null;

    public ScientistManager() {
        scientists = new ArrayList<>();
    }

    public void addScientist(String name, String fieldOfWork, String activeYears, String awards) {
        scientists.add(new Scientist(name, fieldOfWork, activeYears, awards));
    }
    public void addLogician(String name, String fieldOfWork, String activeYears, String awards, String profession,
                            String journalArticles, String bookPublications) {
        scientists.add(new Logician(name, fieldOfWork, activeYears, awards, profession, journalArticles, bookPublications));
    }

    public void removeScientist(byte choice) {
        scientists.remove(choice);
    }

    public void listScientists() {
        for (int i = 0; i < scientists.size(); i++) {
            System.out.printf("Scientists %d: %s\n", (i + 1), scientists.get(i).getBasicInfo());
        }
    }

    public void listMathematicians() {

    }
    public void listPhilosophers() {

    }
    public void listLogicians() {
        for (int i = 0; i < scientists.size(); i++) {
            if (scientists.get(i).getFieldOfWork().equalsIgnoreCase("Logician")) {
                System.out.printf("Scientists %d: %s\n", (i + 1), scientists.get(i).getName());
            }
        }
    }
}
