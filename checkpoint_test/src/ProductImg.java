public class ProductImg {
    private String urls;

    public ProductImg() {
    }

    public ProductImg(String urls) {
        this.urls = urls;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "ProductImg{" +
                "urls='" + urls + '\'' +
                '}';
    }
}
