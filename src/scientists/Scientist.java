package scientists;

public class Scientist {
    private String name;
    private String activeYears;
    private String profession;
    private String awards;

    public Scientist(String name, String profession, String activeYears, String awards) {
        this.name = name;
        this.profession = profession;
        this.activeYears = activeYears;
        this.awards = awards;
    }

    public String getName() {
        return  name;
    }

    public String getProfession() {
        return profession;
    }

    public String getActiveYears() {
        return  activeYears;
    }

    public String getAwards() {
        return  awards;
    }

    public String getInfo(String type) {
        return name + " (" + activeYears + ")";
    }
}
