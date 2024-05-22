import java.util.List;

public class PhysicalProduct extends Product{
    private double weight;
    private double dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(String name, double price, String description, double weight, double dimensions) {
        super(name, price, description);
        this.weight = weight;
        this.dimensions = dimensions;
    }



    public PhysicalProduct(String name, double price,
                           String description,
                           List<ProductImg> images,
                           List<Rating> ratings,
                           double weight, double dimensions) {
        super(name, price, description, images, ratings);
        if (weight < 0 || dimensions < 0) {
            throw new IllegalArgumentException("Weight and dimensions cannot be negative");
        }
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDimensions() {
        return dimensions;
    }

    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return "PhysicalProduct{" +
                "weight=" + weight +
                ", dimensions=" + dimensions +
                '}' + super.toString();
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }
}
