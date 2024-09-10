package movie;
public class Movie {
    // Properties of the Movie class
    String title;
    String genre;
    String leadActor;
    String director;
    int releaseYear;
    double rating;
    String review;

    // Constructor to initialize the Movie object
    public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.review = (rating < 5) ? "Not Good" : "Good"; // Determine the review based on the rating
    }

    // Method to display the movie details
    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating two movie objects
        Movie movie1 = new Movie("Inception", "Sci-Fi", "Leonardo DiCaprio", "Christopher Nolan", 2010, 8.8);
        Movie movie2 = new Movie("Movie XYZ", "Drama", "Actor ABC", "Director PQR", 2022, 4.2);

        // Displaying movie details
        movie1.displayMovieDetails();
        movie2.displayMovieDetails();
    }
}
