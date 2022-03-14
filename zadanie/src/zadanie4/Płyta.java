package zadanie4;

public class P³yta {
    int id;
    String tytul;
    float cena;

    public P³yta(int id, String tytul, float cena){
        this.id = id;
        this.tytul = tytul;
        this.cena = cena;
    }

    public String getTytul() {
        return tytul;
    }

    public float getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Plyta " + id +
                ", tytul='" + tytul + '\'' +
                ", cena=" + cena +
                '}';
    }
}
