public class Book {

    public String name;
    private  Author author;
    private int yearOfPublication;
    private boolean bestseller;
    private int copies;


    Book (){}

    Book(String name, int yearOfPublication, boolean bestseller, int copies, Author author) {
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

    @Override
    public String toString() {
        return "\nBook :\n[" + "name :" + name + ", Year of Publication :" + yearOfPublication + ", Best seller :" + bestseller + ", Copies : " + copies + "]" +
                "\n" + "\t\tAuthor :\n\t\t" + author +"\n\t";
    }

}


