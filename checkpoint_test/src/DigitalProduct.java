import java.util.List;

public class DigitalProduct extends Product {
    private String fileType;
    private double fileSize;



    public DigitalProduct() {
    }
    public DigitalProduct(String name, double price,
                          String description,
                          String fileType, double fileSize) {
        super(name, price, description);
        this.fileType = fileType;
        this.fileSize = fileSize;
    }
    public DigitalProduct(String name, double price,
                          String description,
                          List<ProductImg> images,
                          List<Rating> ratings,
                          String fileType, double fileSize) {
        super(name, price, description, images, ratings);
        if (fileSize < 0) {
            throw new IllegalArgumentException("File size cannot be negative");
        }
        this.fileType = fileType;
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return "DigitalProduct{" +
                "fileType='" + fileType + '\'' +
                ", fileSize=" + fileSize +
                '}' + super.toString();
    }
    @Override
    public void displayDetails() {
        System.out.println(this);
    }
}
