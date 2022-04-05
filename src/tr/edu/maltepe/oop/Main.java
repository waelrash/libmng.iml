package tr.edu.maltepe.oop;

public class Main {

        public static void main(String[] arg)  {


            Library lbr = new Library();


            Professor pr = new Professor();
            Student st = new Student();

            //Creat Books
            //--change books names objects(firstBook) and Strings("First Book")
            Book firstBook = new Book("Pride and Prejudice");
            Book secondBook = new Book("The Great Gatsby");
            Book thirdBook = new Book("Nineteen Eighty Four");


            lbr.addBook(firstBook);
            lbr.addBook(secondBook);
            lbr.addBook(thirdBook);



            System.out.println("The books available before lending :");
            lbr.printAvailableBooks();
            System.out.println();


            lbr.lendBookToProf(pr, firstBook);
            lbr.lendBookToStud(st, secondBook);

            System.out.println("The books available before lending :");
            lbr.printAvailableBooks();
            System.out.println();

            System.out.println("Book borrowed by Prof:");
            pr.printAvailableBooks();
            System.out.println();

            System.out.println("Book borrowed by Student:");
            st.printAvailableBooks();
            System.out.println();

            st.returnBook(lbr, secondBook);
            pr.returnBook(lbr, firstBook);

            System.out.println("Books in the library after returning:");
            lbr.printAvailableBooks();

        }



}