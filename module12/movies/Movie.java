import java.time.LocalDate;

public class Movie {
    private String Name;
    private String Author;
    private int Duration;
    private String Director;
    private LocalDate Date;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public int getDuration() {
        return Duration;
    }
    public void setDuration(int duration) {
        Duration = duration;
    }
    public String getDirector() {
        return Director;
    }
    public void setDirector(String director) {
        Director = director;
    }
    public LocalDate getDate() {
        return Date;
    }
    public void setDate(LocalDate date) {
        Date = date;
    }

    
}
