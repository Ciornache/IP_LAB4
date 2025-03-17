class Main {
    public static void main(String[] args) {
        Carte carte = new Carte("J.K. Rowling", "Harry Potter", "Fantasy", 50);
        carte.adaugaReview(5);
        carte.adaugaReview(4);
        carte.adaugaReview(3);
        System.out.println(carte);
        System.out.println("Media review-urilor: " + carte.medieReview());
        System.out.println("Review-uri sortate: " + carte.sortareReviewuri());
    }
}
