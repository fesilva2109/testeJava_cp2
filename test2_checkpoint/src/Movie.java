import java.time.LocalDateTime;
import java.util.List;

public class Movie extends Media {
    private String director;
    private int launchYear;

    public Movie() {
    }

    public Movie(String title, String description,
                 int duration,
                 List<Rating> ratings,
                 List<MediaImg> imgs,
                 String director, int launchYear) {
        super(title, description, duration, ratings, imgs);
        if (1935 > launchYear && launchYear > LocalDateTime.now().getYear()){
            System.out.println("Release date invalid");
        }
        this.director = director;
        this.launchYear = launchYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Director: " + director + "\n"+
                "Release Date: " + launchYear;
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }
}
