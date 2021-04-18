import java.util.Arrays;

public class Client {

    private String name;
    private String lastName;
    private Book[] booksBorrowed;
    private  int maxBooksLend;
    private boolean validSubscription;
 // should change the boolean to true

    public boolean borrowingBook(Book book) {
        if (!this.validSubscription) {
            System.out.println("Sorry we cant Borrowing  you books\nyour Subscription is not valid");
            return false;
            } else {
                 if (book.getCopies() == 0) {
                     System.out.println("Sorry we don't have any copies in the library");
                     return false;
                 } else {
                        boolean allowToBorrowed = booksBorrowed[booksBorrowed.length- 1] == null;
                         if (!allowToBorrowed) {
                            System.out.println("Sorry we can't Borrowing  you books");
                            System.out.println("You have reached the maximum quota of books you can borrow");
                             return false;
                         } else {
                             int i = 0;
                                 while ( i < booksBorrowed.length) {
                                          if (booksBorrowed[i] == null) {
                                              booksBorrowed[i] = book;
                                              break;
                                          } else i++;
                                }
                             System.out.println("Enjoy reading the book :) ");
                             book.setCopies(book.getCopies()-1);
                             return true;
                }
            }
        }
    }

    public void returnBook(Book book) {
        for (int i = 0; i < booksBorrowed.length; i++) {
            String bookName = booksBorrowed[i].getName();
            if (book.getName().equals(bookName)) {
                booksBorrowed[i] = null;
            }
        }
             book.setCopies(book.getCopies()+1);
    }







    public Client () {}
    public Client (String name , String lastName , int maxBooksLend ,boolean validSubscription , Book[] booksBorrowed) {
        this.name = name;
        this.lastName = lastName;
        this.maxBooksLend = maxBooksLend;
        this.validSubscription = validSubscription;
        this.booksBorrowed = booksBorrowed;

    }


    public Book[] getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(Book[]  booksBorrowed ) {
        this.booksBorrowed =  booksBorrowed ;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

    public int getMaxBooksLend() {
        return maxBooksLend;
    }

    public boolean isValidSubscription() {
        return validSubscription;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMaxBooksLend(int maxBooksLend) {
        this.maxBooksLend = maxBooksLend;
    }

    public void setValidSubscription(boolean validSubscription) {
        this.validSubscription = validSubscription;
    }


//    public static void printArray(Book [] booksBorrowed ) {
//
//        for (int i = 0; i < booksBorrowed.length; i++) {
//            System.out.println(booksBorrowed[i]+", ");
//        }
//    }

    @Override
    public String toString() {
        return "Client : {" +
                "name :" + name + '\'' +
                ", lastName :" + lastName + '\'' +
                ", max Books Lend :" + maxBooksLend +
                ", valid Subscription :" + validSubscription +
                "\n, Books Borrowed : \n " + Arrays.toString(booksBorrowed) + "\n";
    }
}

