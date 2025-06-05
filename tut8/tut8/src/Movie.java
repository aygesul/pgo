import java.util.ArrayList;

public class Movie implements MediaItem, Rentable {
    private String title;
    private String director;
    private int year;
    private int duration;
    private boolean available;


    public Movie(String title, String director, int year, int duration) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.duration = duration;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getDisplayString() {
        return title + " directed by " + director + " (" + year + "), " + duration + " min";
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean rent() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public void returnItem() {
        available = true;
    }

   }



