import java.util.List;

public class Episode {
    private String title;
    private int duration;
    private String description;
    private List<Rating> episodeRating;

    public Episode() {
    }

    public Episode(String title, int duration, String description, List<Rating> episodeRating) {
        this.title = title;
        this.duration = duration;
        this.description = description;
        this.episodeRating = episodeRating;
    }

    public List<Rating> getEpisodeRating() {
        return episodeRating;
    }

    public void setEpisodeRating(List<Rating> episodeRating) {
        this.episodeRating = episodeRating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Title: " + title + "| " +
                "Duration: " + duration + "| " +
                "Description: " + description + "| " +
                "Rating: " + episodeRating;
    }
}
