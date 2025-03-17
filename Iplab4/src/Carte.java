import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carte {
    private String autor;
    private String titlu;
    private String gen;
    private double pret;
    private List<Integer> listaReviewuri;

    public Carte(String autor, String titlu, String gen, double pret) {
        this.autor = autor;
        this.titlu = titlu;
        this.gen = gen;
        this.pret = pret;
        this.listaReviewuri = new ArrayList<>();
    }

    // Getteri și setteri
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        if (pret >= 0) {
            this.pret = pret;
        } else {
            throw new IllegalArgumentException("Prețul nu poate fi negativ!");
        }
    }

    public List<Integer> getListaReviewuri() {
        return listaReviewuri;
    }

    public void adaugaReview(int nota) {
        if (nota >= 1 && nota <= 5) {
            listaReviewuri.add(nota);
        } else {
            throw new IllegalArgumentException("Nota trebuie să fie între 1 și 5!");
        }
    }

    public double medieReview() {
        if (listaReviewuri.isEmpty()) {
            return 0;
        }
        return listaReviewuri.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public List<Integer> sortareReviewuri() {
        List<Integer> sortedReviews = new ArrayList<>(listaReviewuri);
        sortedReviews.sort(Collections.reverseOrder()); // Sortare descrescătoare
        return sortedReviews;
    }

    @Override
    public String toString() {
        return "Carte: " + titlu + " de " + autor + " - Gen: " + gen + ", Pret: " + pret + " RON";
    }
}