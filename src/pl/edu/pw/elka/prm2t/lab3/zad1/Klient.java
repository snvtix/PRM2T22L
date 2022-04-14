package pl.edu.pw.elka.prm2t.lab3.zad1;

public class Klient {

    private int indentyfikator;
    private Koszyk koszyk;

    public Klient(int indentyfikator, Koszyk koszyk) {
        this.indentyfikator = indentyfikator;
        this.koszyk = koszyk;
    }

    @Override
    public String toString() {
        return "Klient o indentyfikatorze: " + indentyfikator + " " + koszyk;
    }
}
