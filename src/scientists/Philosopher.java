package scientists;

public class Philosopher extends Scientist {
    // Declares the Strings variables needed for specific extensions of the Scientist class
    private String fieldOfWork;
    private String journalArticles;
    private String bookPublications;

    // Constructs the variables needed for the specific extensions of the Scientist class
    public Philosopher(String name, String profession, String activeYears, String awards, String fieldOfWork,
                         String journalArticles, String bookPublications) {
        super(name, profession, activeYears, awards);
        this.fieldOfWork = fieldOfWork;
        this.journalArticles = journalArticles;
        this.bookPublications = bookPublications;
    }

    // gets the fieldOfWork variable
    public String getFieldOfWork() {
        return fieldOfWork;
    }

    // Gets the journalArticle variable
    public String getJournalArticles() {
        return journalArticles;
    }

    // Gets the bookPublications variable
    public String getBookPublications() {
        return bookPublications;
    }

    // Overrides the Scientist class so that the extended class can list scientists by profession and by field of work
    // This works by having a type variable hardcoded that matches the specific output that the user wants
    // This can be done because the user has to make a choice associated with what they want to do, and we can
    // associate the type with the choice.
    @Override
    public String getInfo(String type) {
        String info = "";
        if (type.equals("Basic")) {
            info = super.getName() + " (" + super.getActiveYears() + ")";
        }
        else if (type.equals("By Profession")) {
            info = "Profession: " + super.getProfession() + ", Field of Work: " + fieldOfWork
                    + ", Awards: " + super.getAwards() + ", Name: " + super.getName();
        }
        else if (type.equals("By Field of Work")) {
            info = "Field of Work: " + fieldOfWork + ", Awards: " + super.getAwards()
                    + ", Journal Articles: " + journalArticles + ", Book Publications: " + bookPublications +
                    ", Name: " + super.getName();
        }
        return info;
    }
}
