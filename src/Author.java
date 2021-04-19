public class Author {

    private  String firstName;
    private  String lastName;
    private  String language;
    private  String writingGenre;

    public Author() {}
    public Author(String firstName ,String lastName ,String language , String writingGenre) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
        this.writingGenre = writingGenre;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getLanguage() {
        return this.language;
    }
    public String getWritingGenre() {
        return this.writingGenre;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public void setLanguage (String language) {
        this.language = language;
    }
    public void setWritingGenre (String writingGenre) {
        this.writingGenre = writingGenre;
    }

    public void print() {
        System.out.println("[Author] :\n" +
                "First Name :" + this.firstName +
                ",Last Name :" + this.lastName +
                ",Language :" + this.language +
                "Genre :" + this.writingGenre);
    }



}
