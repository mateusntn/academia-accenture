import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Movies {
    private ArrayList<Movie> Movies;

    public int TotalMovies() {
        return Movies.size();
    }

    public int TotalMoviesByAuthor(String author)
    {
        return (int)Movies.stream().filter(movie -> movie.getAuthor() == author).count();
    }

    public ArrayList<Movie> GetMoviesByMaxDuration(int maxDuration)
    {
        return new ArrayList<Movie>(Movies.stream().filter(movie -> movie.getDuration() < maxDuration).collect(Collectors.toList()));
    }

    public Movie LongerMovie() {
        return Movies.stream().sorted(Comparator.comparing(Movie::getDuration)).findFirst().get();
    }

    public Movie ShorterMovie() {
        return Movies.stream().sorted(Comparator.comparing(Movie::getDuration).reversed()).findFirst().get();
    }

    public void OrderMovies() {
        Movies = new ArrayList<Movie>(Movies.stream().sorted(Comparator.comparing(Movie::getDate)).collect(Collectors.toList()));
    }

    public ArrayList<Movie> getMovies() {
        return Movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        Movies = movies;
    }    
}
