package tr.edu.maltepe.oop;


public class Student extends Person{
    int StudentNum;


  java.util.ArrayList<Book> stdBook;


    public int getStudentNum () {
          return StudentNum;
      }

      public void setStudentNum ( int studentNum){
          StudentNum = studentNum;
      }

      public void learn () {
          System.out.println(getName() + " " + getSurname() + "every thing is clear");
      }



    public Student() {
         stdBook  = new java.util.ArrayList<Book>();

    }



    public void addBook(Book book) {
        stdBook.add(book);
    }

    public void returnBook(Library lib, Book book) {
        stdBook.remove(book);
        lib.addBook(book);
    }

    public void printAvailableBooks() {
        boolean bookPresent = false;
        for (Book book : stdBook) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
                bookPresent = true;
            }
        }

        if (!bookPresent) {
            System.out.println("No book in catalog");
        }
    }
}