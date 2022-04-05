package tr.edu.maltepe.oop;


public class Book {
    // Add the missing implementation to this class!
    private String title;
    boolean borrowed;




    public Book(String bookTitle) {
        this.title = bookTitle;
        this.borrowed = false;
    }



    public void borrowed() {
        this.borrowed = true;
    }



    public void returned() {
        this.borrowed = false;
    }



    public boolean isBorrowed() {
        return this.borrowed;
    }


    // Returns the title of the book
    public String getTitle() {
        return this.title;
    }


}