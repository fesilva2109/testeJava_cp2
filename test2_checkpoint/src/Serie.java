import java.util.List;

public class Serie extends Media {
    private int seasonNumber;
    private List<Episode> episodes;

    public Serie() {
    }

    public Serie(String title, String description,
                 int duration,
                 List<Rating> ratings,
                 List<MediaImg> imgs,
                 int seasonNumber, List<Episode> episodes) {
        super(title, description, duration, ratings, imgs);
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Number of Seasons: " + seasonNumber +"\n"+
                "Episodes: " + episodes;
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }
}
