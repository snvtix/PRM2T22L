package pl.edu.pw.elka.prm2t.lab3.zad1;

import pl.edu.pw.elka.prm2t.lab3.zad1.Produkt;

public class ProduktWKoszyku extends Produkt {

    private int liczbaSztukProduktu;

    public ProduktWKoszyku(String nazwa, int cena, int liczbaSztukProduktu) {
        super(nazwa, cena);
        this.liczbaSztukProduktu = liczbaSztukProduktu;
    }

    public int cenaProduktow() {
        return super.getCena()*liczbaSztukProduktu;
    }

    @Override
    public String toString() {
        if(liczbaSztukProduktu != 0) {
            return super.toString() + "liczba produktu w koszyku: " + liczbaSztukProduktu;
        }
        else{
            return super.toString() + "brak produktu w koszyku";
        }
    }
}
