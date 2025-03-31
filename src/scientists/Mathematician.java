package scientists;

public class Mathematician extends Scientist {
    private String fieldOfWork;
    private String journalArticles;
    private String bookPublications;
    public Mathematician(String name, String profession, String activeYears, String awards, String fieldOfWork,
                    String journalArticles, String bookPublications) {
        super(name, profession, activeYears, awards);
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
    public String getInfo(String type) {
        String info = "";
        if (type.equals("Basic")) {
            info = super.getName() + " (" + super.getActiveYears() + ")";
        }
        else if (type.equals("By Profession")) {
            info = "Name: " + super.getName() + ", Profession: " + super.getProfession() + ", Field of Work: " + fieldOfWork
                    + ", Awards: " + super.getAwards();
        }
        else if (type.equals("By Field of Work")) {
            info = "Name: " + super.getName() + ", Field of Work: " + fieldOfWork + ", Awards: " + super.getAwards()
                    + ", Journal Articles: " + journalArticles + ", Book Publications: " + bookPublications;
        }
        return info;
    }
}
