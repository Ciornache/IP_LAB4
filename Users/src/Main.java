import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void Main(String [] args) {
        User user = new User("Stefan", 20, 3.7);
        Carte carte = new Carte("J.K. Rowling", "Harry Potter", "Fantasy", 50);
        carte.adaugaReview(5);
        carte.adaugaReview(4);
        carte.adaugaReview(3);
        List<Review> reviews = new ArrayList();
        reviews.add(new Review(3.5));
        reviews.add(new Review(2));
        reviews.add(new Review(5));
        user.addBookReviewed(carte, reviews);
        double avg = user.getAverageReviewScoreByBook(carte);
    }
}