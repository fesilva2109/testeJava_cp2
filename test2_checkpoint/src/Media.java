import java.util.List;

public abstract class Media {
    protected String title;
    protected String description;
    protected int duration;
    protected List<Rating> ratings;
    protected List<MediaImg> imgs;

    public abstract void displayDetails();

    public Media() {
    }

    public Media(String title, String description, int duration, List<Rating> ratings, List<MediaImg> imgs) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.ratings = ratings;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<MediaImg> getImgs() {
        return imgs;
    }

    public void setImgs(List<MediaImg> imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "Title: " + title + '\n' +
                "Description: " + description + '\n' +
                "Duration:  " + duration +'\n' +
                "Ratings: " + ratings +'\n' +
                "Images:  " + imgs+ '\n';
    }
}
