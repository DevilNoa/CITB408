package repo;

public class Repo {
    private double maxSize;
    private int currentNumberOfDocuments;
    private double currentSize;

    public Repo(double maxSize) {
        this.maxSize = maxSize;
        this.currentNumberOfDocuments = 0;
        this.currentSize = 0;
    }

    public Repo(double maxSize, int currentNumberOfDocuments, double currentSize) {
        this.maxSize = maxSize;
        this.currentNumberOfDocuments = currentNumberOfDocuments;
        this.currentSize = currentSize;
    }

    public double getMaxSize() {
        return maxSize;
    }

    public int getCurrentNumberOfDocuments() {
        return currentNumberOfDocuments;
    }

    public double getCurrentSize() {
        return currentSize;
    }
    public double freeSpace(){
        return this.maxSize - this.currentSize;
    }
    public boolean uploadDocument(Document document)
    {
        if (this.freeSpace()>=document.getSize())

        {
            this.currentNumberOfDocuments++;
            this.currentSize+=document.getSize();
            System.out.println(document.getName()+" is uploaded!");
            return true;
        }

        return false;

    }


    @Override
    public String toString() {
        return "Repo{" +
                "maxSize=" + maxSize +
                ", currentNumberOfDocuments=" + currentNumberOfDocuments +
                ", currentSize=" + currentSize +
                '}';
    }
}
