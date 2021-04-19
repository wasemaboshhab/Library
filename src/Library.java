import java.util.Arrays;

public class Library {
    private Book[] books;
    private Client[] clients;

    public Library(Book[] books) {
        this.books = books;
    }

    public Library (Client[] clients) {
        this.clients = clients;
    }


    public Library(Book[] books, Client[] clients) {
        this.books = books;
        this.clients = clients;
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
        String[] authorNameSplatted = splitAuthorName(author);
        String authorNameWanted = authorNameSplatted[0] + " " + authorNameSplatted[1];
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

    public static String[] splitAuthorName(String name) {
        String[] authorName = new String[2];
        name = name + " ";
        String outPout = "";
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (currentChar != ' ') {
                outPout = outPout + currentChar;
            }
            else {
                initAuthorNameToArray(outPout, authorName);
                outPout = "";
            }
        }
        return authorName;
    }


    public static String[] initAuthorNameToArray(String outPout , String[] authorName) {
        for (int i = 0; i < authorName.length; i++) {
            if (authorName[i] == null) {
                authorName[i] = outPout;
                break;
            }
        }
        return authorName;


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

//    private Book[] books;
//    private Client[] clients;

    public void status() {
        System.out.println("Books existed in  the Library: \n");
        for (int i = 0; i < this.books.length; i++) {
            Book currentBook = books[i];
            if (currentBook != null) {
                currentBook.print();
                System.out.println("--------------------------");
                System.out.println("--------------------------");
            }
        }
        System.out.println("Clients :");
        for (int i = 0; i < clients.length; i++) {
            Client currentClient = clients[i];
            if (currentClient != null) {
                currentClient.print();
                System.out.println("--------------------------");
                System.out.println("--------------------------");
            }
        }
        }

    }









    





