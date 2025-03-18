package main;

public class Scientist {
    private String name;
    private String activeYears;
    private String fieldOfWork;
    private String awards;

    public Scientist(String name, String fieldOfWork, String activeYears, String awards) {
        this.name = name;
        this.fieldOfWork = fieldOfWork;
        this.activeYears = activeYears;
        this.awards = awards;
    }

    public String getBasicInfo() {
        return name + " (" + activeYears + ")";
    }

    public String getProfessionInfo() {
        return getBasicInfo() + " | Field: " + fieldOfWork + " | Awards: " + awards;
    }



}
