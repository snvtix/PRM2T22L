package pl.edu.pw.elka.prm2t.lab3.zad1;

public class Produkt {

    private String nazwa;
    private int cena;

    public Produkt(String nazwa, int cena){
        this.nazwa=nazwa;
        this.cena=cena;
    }

    public int getCena() {
        return cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return  nazwa + ", cena: " + cena + "zl, ";
    }
}
