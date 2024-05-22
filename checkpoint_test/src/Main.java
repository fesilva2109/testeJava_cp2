
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var digitalProduct = new DigitalProduct(
                "Echo",
                400,
                "Personal Assistant",
                List.of(
                        new ProductImg("https://m.media-amazon.com/images/I/71GYHL14uVL._AC_SX425_.jpg")
                ),
                List.of(
                        new Rating("fesilva2109", 5, "That's a great assistant, I often use it in my day"),
                        new Rating("leo123", 1, "I had a really bad experience with this product, please don't buy it")
                ),
               "exe", 480);
        var physicalProduct = new PhysicalProduct(
                "Echo",
                400,
                "Personal Assistant",
                List.of(
                        new ProductImg("https://m.media-amazon.com/images/I/71GYHL14uVL._AC_SX425_.jpg")
                ),
                List.of(
                        new Rating("fesilva2109", 5, "That's a great assistant, I often use it in my day"),
                        new Rating("leo123", 1, "I had a really bad experience with this product, please don't buy it")
                ),
                18.05, 18
        );
        digitalProduct.displayDetails();
        physicalProduct.displayDetails();
    }

}