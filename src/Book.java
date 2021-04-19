public class   Book {

    public String name;
    private  Author author;
    private int yearOfPublication;
    private boolean bestseller;
    private int copies;


    public Book (){}

    public Book(String name, int yearOfPublication, boolean bestseller, int copies, Author author) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.bestseller = bestseller;
        this.copies = copies;
        this.author = author;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean isBestseller() {
        return bestseller;
    }

    public void setBestseller(boolean bestseller) {
        this.bestseller = bestseller;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void print() {
        System.out.println("The Book's Name: " + this.name +
                ",its has been published on " + this.yearOfPublication +
                ",and its " + ((this.bestseller) ? "" : "Not") +
                ", a Best seller " +
                '(' + this.copies + " available copies)");
        System.out.println();
        this.author.print();

    }

}


