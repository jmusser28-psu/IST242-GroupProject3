package scientists;

public class Scientist {
    // Declares the string variables needed to construct the Scientist class
    private String name;
    private String activeYears;
    private String profession;
    private String awards;

    // Constructs the variables used by the Scientist class
    public Scientist(String name, String profession, String activeYears, String awards) {
        this.name = name;
        this.profession = profession;
        this.activeYears = activeYears;
        this.awards = awards;
    }

    // Returns the name of a scientist
    public String getName() {
        return name;
    }

    // Returns the profession of a scientist
    public String getProfession() {
        return profession;
    }

    // Returns the active years of a scientist
    public String getActiveYears() {
        return activeYears;
    }

    // Returns the awards of a scientist
    public String getAwards() {
        return  awards;
    }

    // Returns basic info (this is the same as the basic type in the specific classes)
    public String getInfo(String type) {
        return name + " (" + activeYears + ")";
    }
}
