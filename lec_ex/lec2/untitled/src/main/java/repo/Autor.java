package repo;

public class Autor {
    private String name;

    public Autor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                '}';
    }
}
