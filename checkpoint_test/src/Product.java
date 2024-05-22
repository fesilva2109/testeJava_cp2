import java.util.List;

public abstract class Product {
    protected String name;
    protected double price;
    protected String description;
    protected List<ProductImg> images;
    protected List<Rating> ratings;

    public Product() {
    }
    public Product(String name, double price, String description) {

       this.name =name;
       this.price = price;
       this.description = description;
    }
    public Product(String name, double price, String description, List<ProductImg> images, List<Rating> ratings) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.price = price;
        this.description = description;
        this.images = images;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProductImg> getImages() {
        return images;
    }

    public void setImages(List<ProductImg> images) {
        this.images = images;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public abstract void displayDetails();

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", images=" + images +
                ", ratings=" + ratings +
                '}';
    }
}
