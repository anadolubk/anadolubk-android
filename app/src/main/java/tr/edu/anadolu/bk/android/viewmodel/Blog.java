package tr.edu.anadolu.bk.android.viewmodel;

/**
 * Created by alp on 24/10/16.
 */

public class Blog {
    private String title, genre;
    private int background;

    public  Blog(){

    }
    public Blog(String title, String genre, int background) {
        this.title = title;
        this.genre = genre;
        this.background = background;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }
}
