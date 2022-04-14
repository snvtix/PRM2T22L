package pl.edu.pw.elka.prm2t.lab2;

import java.util.Objects;

public class EKIPA {
    private String nazwaZespolu;
    private String lider;
    private String plecLidera;
    private int netWorth;
    private int wyswietlenia;

    public EKIPA(){
        this.setNazwaZespolu("Ekipa");
        this.setLider("Frizoluszek");
        this.setPlecLidera("Mezczyzna");
        this.setNetWorth(200000);
        this.wyswietlenia = 1000000000;
    }

    public void setNazwaZespolu(String nazwaZespolu){
        this.nazwaZespolu = nazwaZespolu;
    }

    public void setLider(String lider){
        this.lider = lider;
    }

    public void setPlecLidera(String plecLidera){
        this.plecLidera = plecLidera;
    }

    public void setNetWorth(int netWorth){
        this.netWorth = netWorth;
    }

    public String getNazwaZespolu(){
        return nazwaZespolu;
    }
    public String getLider(){
        return lider;
    }
    public String getPlecLidera(){
        return plecLidera;
    }
    public int getNetWorth(){
        return netWorth;
    }
    public int getWyswietlenia(){
        return wyswietlenia;
    }

    public String toString(){
        return "zespol: " + nazwaZespolu + ", lider: " + lider + ", plec: " + plecLidera + ", net worth w $: " + netWorth + ", wyswieylenia: " + wyswietlenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EKIPA ekipa = (EKIPA) o;
        return netWorth == ekipa.netWorth && wyswietlenia == ekipa.wyswietlenia && Objects.equals(nazwaZespolu, ekipa.nazwaZespolu) && Objects.equals(lider, ekipa.lider) && Objects.equals(plecLidera, ekipa.plecLidera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaZespolu, lider, plecLidera, netWorth, wyswietlenia);
    }

    public static void main(String[] arg){
        EKIPA myObj = new EKIPA();
        EKIPA myObj2 = new EKIPA();
        System.out.println(myObj.getNazwaZespolu());
        System.out.println(myObj.getLider());
        System.out.println(myObj.getPlecLidera());
        System.out.println(myObj.getNetWorth());
        System.out.println(myObj.getWyswietlenia());
        System.out.println(myObj);
        System.out.println(myObj.equals(myObj2));
        System.out.println(myObj.hashCode());
        System.out.println(myObj2.hashCode());
        myObj.setLider("Wersow");

    }
}
