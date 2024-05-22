public class MediaImg {
    private String url;

    public MediaImg() {
    }

    public MediaImg(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "url: " + url;
    }
}
