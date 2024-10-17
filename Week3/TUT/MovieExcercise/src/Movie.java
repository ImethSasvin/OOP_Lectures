import java.util.Arrays;

// Movie.java
public class Movie {
    private String title;
    private String category;
    private Director director;
    private int numAwards;
    private Actor[] actors;

    public Movie(String title, String category, Director director) {
        this.title = title;
        this.category = category;
        this.director = director;
    }

    public void setNumAwards(int numAwards) {
        this.numAwards = numAwards;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Director getDirector() {
        return director;
    }

    public int getNumAwards() {
        return numAwards;
    }
    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return title + " (" + category + "), directed by " + director + ", won " + numAwards + " awards, starring " + Arrays.toString(actors);
    }
}