import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var movie = new Movie(
                "Lord of Rings",
                "Frodo wants to thrill the way of your biggest inspiration, Hobbit",
                300,
                List.of(
                        new Rating("Hobbit", 5, "He's a crazy kid, I told him to not take this way, but he did it anyway"),
                        new Rating("Frodo",5,"It was pretty fun this journey LOL")
                ),
                List.of(
                        new MediaImg("https://th.bing.com/th/id/OIF.6lImuMx6a9HQIYYRL0hTfQ?rs=1&pid=ImgDetMain")
                ),
                "J.R.R Tolkien",
                2000
        );
        var serie = new Serie(
                "How i met your mother",
                "Ted, is a normal NY guy, sharing a lot of legendary stories with his friends",
                200,
                List.of(
                        new Rating("Barney", 5, "It was legen.. wait for it"),
                        new Rating("Barney",5,"..dary, AWESOME")
                ),
                List.of(
                        new MediaImg("https://th.bing.com/th/id/OIP.CAMLMgoO5pyTreUXF6egMAHaFj?rs=1&pid=ImgDetMain")
                ), 8
                ,
                List.of(
                        new Episode("Purple Giraffe",
                                22,
                                "Ted throws a party in hopes of seeing Robin again, but when she doesn't show up, he throws another... and another.",
                                List.of(
                                        new Rating("callanvass",4,"A party trifecta")
                                ))
                )
        );
        movie.displayDetails();
        serie.displayDetails();
    }
}