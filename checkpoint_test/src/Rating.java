public class Rating {
    private String user;
    private int rating;
    private String ratingText;

    public Rating() {
    }

    public Rating(String user, int rating, String ratingText) {
        this.user = user;
        this.rating = rating;
        this.ratingText = ratingText;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRatingText() {
        return ratingText;
    }

    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "user='" + user + '\'' +
                ", rating=" + rating +
                ", ratingText='" + ratingText + '\'' +
                '}';
    }
}
