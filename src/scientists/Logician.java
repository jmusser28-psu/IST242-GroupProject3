package scientists;

public class Logician extends Scientist {
    private String fieldOfWork;
    private String journalArticles;
    private String bookPublications;
    public Logician(String name, String fieldOfWork, String activeYears, String awards, String profession,
                    String journalArticles, String bookPublications) {
        super(name, fieldOfWork, activeYears, awards);
        this.fieldOfWork = fieldOfWork;
        this.journalArticles = journalArticles;
        this.bookPublications = bookPublications;
    }

    public String getFieldOfWork() {
        return fieldOfWork;
    }
    public String getJournalArticles() {
        return journalArticles;
    }
    public String getBookPublications() {
        return bookPublications;
    }
    @Override
    public String getProfessionInfo() {
        return getBasicInfo() + " | Profession: " + getProfession() + " | Awards: " + getAwards() + " | Field of Work: " +
                fieldOfWork;
    }
}
