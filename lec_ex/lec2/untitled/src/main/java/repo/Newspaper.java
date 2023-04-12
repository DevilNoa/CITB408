package repo;

public class Newspaper extends Document {
    private int numerOfArticles;

    public Newspaper(){

    }

    public Newspaper(String name, double size, String fileFormat, int numerOfArticles) {
        super(name, size, fileFormat);
        this.numerOfArticles = numerOfArticles;
    }

    public int getNumerOfArticles() {
        return numerOfArticles;
    }

    @Override
    public String toString() {
        return super.toString() + "Newspaper{" +
                "numerOfArticles=" + numerOfArticles +
                "} "  ;
    }
}
