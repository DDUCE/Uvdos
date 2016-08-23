package uvdos.uvdos;

/**
 * Created by Keval Rathod on 8/24/2016.
 */
public class Movie {
    private String title, len, quality;

    public Movie() {
    }

    public Movie(String title, String genre, String year) {
        this.title = title;
        this.len = genre;
        this.quality = genre;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getLen() {
        return len;
    }

    public void setLen(String len) {
        this.len = len;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
