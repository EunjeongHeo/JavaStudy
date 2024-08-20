package section9.Example1;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String isbn, String author) {
        //super();
        super(name, price);
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
