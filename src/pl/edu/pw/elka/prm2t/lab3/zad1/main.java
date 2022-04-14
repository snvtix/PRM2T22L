package pl.edu.pw.elka.prm2t.lab3.zad1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class main {

    public static void obsluz(ArrayList<Klient> klienci){
        System.out.println(klienci.get(0));
        klienci.remove(0);
    }

    public static void main(String[] arg){

        Produkt pomidor = new Produkt("pomidor",5);
        Produkt ogorek = new Produkt("ogorek",4);
        Produkt bulka = new Produkt("bulka",2);
        Produkt ser = new Produkt("ser",7);
        Produkt maslo = new Produkt("maslo",10);
        Produkt szynka = new Produkt("szynka",15);
        Produkt jablko = new Produkt("jalbko",3);
        Produkt banan = new Produkt("banan",6);
        Produkt mleko = new Produkt("mleko",5);
        Produkt kawa = new Produkt("kawa",13);

        ArrayList<Klient> klienci = new ArrayList<>();

        ArrayList<Produkt> produktyWSklepie = new ArrayList<>();
        produktyWSklepie.add(pomidor);
        produktyWSklepie.add(ogorek);
        produktyWSklepie.add(bulka);
        produktyWSklepie.add(ser);
        produktyWSklepie.add(maslo);
        produktyWSklepie.add(szynka);
        produktyWSklepie.add(jablko);
        produktyWSklepie.add(banan);
        produktyWSklepie.add(mleko);
        produktyWSklepie.add(kawa);

        for(int i = 1; i<21; i++){
            Koszyk koszyk = new Koszyk(new Stack<>());
            for(Produkt produkt: produktyWSklepie){
                Random rnd = new Random();
                ProduktWKoszyku pom = new ProduktWKoszyku(produkt.getNazwa(), produkt.getCena(), rnd.nextInt(5));
                koszyk.getProduktyWKoszyku().push(pom);
            }
            klienci.add(new Klient(i,koszyk));
        }

        for(Klient klient: klienci){
            System.out.println(klient);
        }

        obsluz(klienci);
        obsluz(klienci);
        obsluz(klienci);

    }
}
