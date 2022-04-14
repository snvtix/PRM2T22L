package pl.edu.pw.elka.prm2t.lab3.zad1;

import java.util.Stack;

public class Koszyk{

    Stack<ProduktWKoszyku> produktyWKoszyku = new Stack<>();

    public Koszyk(Stack<ProduktWKoszyku> produktyWKoszyku) {
        this.produktyWKoszyku = produktyWKoszyku;
    }

    public int cenaDoZaplaty() {
        int suma = 0;
        for(ProduktWKoszyku produkt: produktyWKoszyku) {
            suma += produkt.cenaProduktow();
        }
        return suma;
    }

    public Stack<ProduktWKoszyku> getProduktyWKoszyku() {
        return produktyWKoszyku;
    }

    @Override
    public String toString() {
        return "produkty w koszyku: " + produktyWKoszyku +
                " cena do zaplaty: " + this.cenaDoZaplaty() + " zl";
    }
}
