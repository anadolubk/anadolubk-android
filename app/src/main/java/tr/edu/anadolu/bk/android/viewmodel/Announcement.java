package tr.edu.anadolu.bk.android.viewmodel;

import android.content.Context;

/**
 * Created by alp on 15/08/16.
 */
public class Announcement {
    private String title, genre;
    private int background;
    public Announcement(){
    }

    public Announcement ( String title, String genre, int background){
        this.title=title;
        this.genre=genre;
        this.background=background;
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
