public class Main {

    public static void main(String[] args) {
                                //Authors
        Author author1 = new Author("Wasim", "Shhab", "Arabic", "philosophy");
        Author author2 = new Author("Shai", "Givate", "Hebrew ", null);
        Author author3 = new Author("Shai", "Givate", "Arabic", null);
                                    //books
        Book book1 = new Book("The secret", 2008, true, 2, author1);
        Book book2 = new Book("body language", 2005, true, 3, author2);
        Book book3 = new Book("Unconscious", 1999, true, 30, author3);

        Book[] booksBorrowed = new Book[2];
        Client client1 = new Client("Mike", "Samuel", 2, true, booksBorrowed);

        Client client2 = new Client("Yoon", "Seon", 1, true ,booksBorrowed);



                //Borrowed Test
       /* System.out.println(Arrays.toString(client1.getBooksBorrowed()));
        client1.borrowingBook(book2);
        client1.borrowingBook(book1);
        client1.borrowingBook(book3);

        System.out.println(Arrays.toString(client1.getBooksBorrowed()));
//        client1.returnBook(book2);
        System.out.println("************* return book");
        client1.returnBook(book2);
        System.out.println(Arrays.toString(client1.getBooksBorrowed()));
*/
                    //try to get information from client Class
      /*  Client[] libraryCustomers = {client1, client2};
        System.out.println(libraryCustomers[0].isValidSubscription());
        System.out.println(Arrays.toString(libraryCustomers[0].getBooksBorrowed()));
*/
        Client[] libraryClients = {client1, client2};
        Book[] booksInTheLibrary = {book1, book2, book3};
        Library library = new Library(booksInTheLibrary ,libraryClients);
        library.status();



//
//        System.out.println(Arrays.toString(library.searchBooksByName("The secret")));  //done
//        System.out.println(Arrays.toString(library.searchBooksByMinimumYearOfPublication(2000))); // done
//        System.out.println(Arrays.toString(library.searchBooksByAuthorName("Shai Givate"))); // done




    }

}
