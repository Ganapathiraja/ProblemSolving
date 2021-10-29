import sun.awt.geom.AreaOp;

abstract class BookDetails
{

    private final String bookName;
    private final String genre;
    private final String author;
    private int bookPages;

    BookDetails(String bookName, String genre,String author)
    {
       this.bookName = bookName;
       this.genre = genre;
       this.author = author;
    }


    abstract void bookGenre();

}




// Book category (ex  Romantic , Thriller , Educational ..... )


class  ThrillerBook extends BookDetails implements BookCategory{



    ThrillerBook(String bookName, String genre, String author) {
        super(bookName, genre, author);
    }

    @Override
    void bookGenre() {
        System.out.println("hey this is thrillerBook");
    }

    @Override
    public void bookGenre(Book book) {

    }
}

class Book implements BookCategory{


    @Override
    public void bookGenre(Book book) {

    }
}

interface BookCategory{

   void bookGenre(Book book);



}

enum Cards{
    JACK,DIAMONDS,HEARTS,SPAWN
}


public class SimpleMain {

    public static void main(String[] args) {




        Cards cards ;
        cards = Cards.JACK;

        switch (cards){

            case JACK:
                System.out.println("this is form JACK");

            case DIAMONDS:
                System.out.println("this is form DIAMONDS");

            default:
                System.out.println("Opps a wrong entry......");
                break;
        }

    }

}
