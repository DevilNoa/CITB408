package repo;

public class Document {
    private String name;
    private double size;
    private String fileFormat;

    public Document() {
    }

    public Document(String name, double size, String fileFormat) {
        this.name = name;
        this.size = size;
        this.fileFormat = fileFormat;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
}
