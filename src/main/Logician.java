package main;

public class Logician extends Scientist {
    private String profession;
    private String journalArticles;
    private String bookPublications;
    public Logician(String name, String fieldOfWork, String activeYears, String awards, String profession,
                    String journalArticles, String bookPublications) {
        super(name, fieldOfWork, activeYears, awards);
        this.profession = profession;
        this.journalArticles = journalArticles;
        this.bookPublications = bookPublications;
    }
}
