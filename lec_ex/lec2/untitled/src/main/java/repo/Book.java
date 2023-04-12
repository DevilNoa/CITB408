package repo;

public class Book extends Document {
    private Autor autor;
    private String isbn;

    public Book() {
    }

    public Book(String name, double size, String fileFormat, Autor autor, String isbn) {
        super(name, size, fileFormat);
        this.autor = autor;
        this.isbn = isbn;
    }

    //    public Book(String name, double size, String fileFormat, Autor autor, String isbn) {
//        super(name, size, fileFormat);
//        this.autor = autor;
//        this.isbn = isbn;
//    }

    public Autor getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return  super.toString()+ "Book{" +
                "autor=" + autor +
                ", isbn='" + isbn + '\'' +
                "} " ;
    }
}
