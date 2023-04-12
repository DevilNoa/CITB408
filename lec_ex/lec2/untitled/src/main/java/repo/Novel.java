package repo;

public class Novel extends Book {
    private String novelAbstract;

    public Novel() {

    }

    public Novel(String name, double size, String fileFormat, Autor autor, String isbn, String novelAbstract) {
        super(name, size, fileFormat, autor, isbn);
        this.novelAbstract = novelAbstract;
    }

    public String getNovelAbstract() {
        return novelAbstract;
    }

    @Override
    public String toString() {
        return super.toString() + "Novel{" +
                "novelAbstract='" + novelAbstract + '\'' +
                "} ";
    }
}
