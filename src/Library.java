import java.util.Arrays;

public class Library {
    private Book[] books;
    private Client[] clients;

    public Library(Book[] books) {
        this.books = books;

    }

    public Book[] searchBooksByName(String bookName) {
        int counter = 0;
        for (int i = 0; i < books.length ; i++) {
            String currentBook = books[i].getName();
            if (bookName.equals(currentBook))
                counter++;
        }
        Book [] booksFounded = new Book[counter];
        for (int i = 0; i < books.length ; i++) {
            String currentBook = books[i].getName();
            if (bookName.equals(currentBook)) {
                int j = 0;
                while (booksFounded[j] != null) {
                    j++;
                }
                booksFounded[j] = books[i];
            }
        }
        return booksFounded;
    }

    public Book[] searchBooksByAuthorName(String author) {

        String[] splitAuthorName = author.split(" ");
        String authorNameWanted = splitAuthorName[0] + " " + splitAuthorName[1];
        int counter = 0;
        for (int i = 0; i < books.length; i++) {
            String currentAuthorName = books[i].getAuthor().getFirstName() +" "+ books[i].getAuthor().getLastName();

            boolean checkAuthorName = currentAuthorName.equals(authorNameWanted);
            if (checkAuthorName) {
                counter++;
                 }
        }
        Book[] booksFounded = new Book[counter];
        for (int i = 0; i < books.length; i++) {
            String authorName = books[i].getAuthor().getFirstName() +" "+ books[i].getAuthor().getLastName();
            boolean checkAuthorName = authorName.equals(authorNameWanted);
            if (checkAuthorName) {
                int j = 0;
                while (booksFounded[j] != null) {
                    j++;
                }
                booksFounded[j] = books[i];
            }
        }

        return booksFounded;
    }


    public Book[] searchBooksByMinimumYearOfPublication(int yearOfPublication) {
        int counter = 0;
        for (int i = 0; i < books.length ; i++) {
            int year = books[i].getYearOfPublication();
            boolean yearOfPublicationGreater = year > yearOfPublication;
            if (yearOfPublicationGreater) {
                counter++;
            }
        }
        Book[] booksFounded = new Book[counter];
        for (int i = 0; i < books.length ; i++) {
            int year = books[i].getYearOfPublication();
            boolean yearOfPublicationGreater = year > yearOfPublication;
            if (yearOfPublicationGreater) {
                int j = 0;
                while (booksFounded[j] != null) {
                    j++;
                }
                booksFounded[j] = books[i];
            }
        }
        return booksFounded;
    }


    public Book[] getBooks() {
        return books;
    }
    public Client[] getClients() {
        return clients;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }
    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Library : [" + "books=" + Arrays.toString(books) + "]"+"\nClients : [" + Arrays.toString(clients) +"]"  ;

    }
}






    





