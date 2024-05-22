public class Rating {
    private String user;
    private int score;
    private String textRating;

    public Rating() {
    }

    public Rating(String user, int score, String textRating) {
        if (0>score && score>5){
            System.out.println("Invalid score");
        }
        this.user = user;
        this.score = score;
        this.textRating = textRating;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTextRating() {
        return textRating;
    }

    public void setTextRating(String textRating) {
        this.textRating = textRating;
    }

    @Override
    public String toString() {
        return "User: " + user +"| "+
                "Score: " + score +"| "+
                "Rating: " + textRating+ "| ";
    }
}
