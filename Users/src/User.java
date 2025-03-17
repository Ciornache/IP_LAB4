import java.util.ArrayList;
import java.util.List;

public class User
{

    public static class Pair<F,S>
    {
        public F first;
        public S second;

        public Pair(F first, S second)
        {
            this.first = first;
            this.second = second;
        }
    }

    private String name;

    private List<Pair<Carte, List<Review>>> booksReviewed;

    private int age;

    private double userRating;

    public User(String name, int age,double userRating)
    {
        booksReviewed = new ArrayList();
        this.name = name;
        this.age = age;
        this.userRating = userRating;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getUserRating()
    {
        return userRating;
    }

    public List<Pair<Carte, List<Review>>> getBooksReviewed()
    {
        return booksReviewed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setUserRating(double userRating)
    {
        this.userRating = userRating;
    }

    public void setBooksReviewed(List<Pair<Carte, List<Review>>> booksReviewed)
    {
        this.booksReviewed = booksReviewed;
    }

    public boolean addBookReviewed(Carte book, List<Review> scores)
    {
        for(Pair<Carte, List<Review>> b : booksReviewed)
            if(b.first.equals(book))
                return false;
        booksReviewed.add(new Pair<Carte, List<Review>>(book, new ArrayList(scores)));

        return true;
    }


    public double getAverageReviewScoreByBook(Carte book)
    {
        for(Pair<Carte, List<Review>> pair : booksReviewed) {
            if(pair.first.equals(book)) {
                double score = 0;
                for(Review review : pair.second)
                    score += review.score;
                score /= booksReviewed.size();
                return score;
            }
        }
        return 0;
    }


}