package tr.edu.maltepe.oop;


public class Professor extends Person {


    static java.util.ArrayList<Book> myBooks;


    public Professor() {
        myBooks = new java.util.ArrayList<Book>();
    }

    //--Change the name of the functions
    public void addBook(Book book) {
        myBooks.add(book);
    }

    public void returnBook(Library lib, Book book){
        myBooks.remove(book);
        lib.addBook(book);
    }
    public void printAvailableBooks() {
        boolean bookPresent = false;
        for (Book book : myBooks) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
                bookPresent = true;
            }
        }

        if (!bookPresent) {
            System.out.println("No book in catalog");
        }
    }
    private int proId;
    public void setProId (int pi) {
        proId = pi;
    }

    public int getProId(int i) {
        return proId;
    }

    void teaches(){
        System.out.println("Prof is teaching now");
    }



}