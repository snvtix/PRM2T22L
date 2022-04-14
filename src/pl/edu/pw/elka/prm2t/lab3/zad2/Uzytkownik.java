package pl.edu.pw.elka.prm2t.lab3.zad2;

import java.util.Hashtable;
import java.util.Scanner;

public class Uzytkownik {

    public static void main(String[] arg) {

        String nazwa = null;
        String pnazwa = null;
        String haslo;
        Scanner scanner = new Scanner(System.in);
        Hashtable<String, String> uzytkownicy = new Hashtable<>();

        System.out.println("Podaj nazwe uzytkownika, nazwa uzytkownika q oznacza przerwanie logowania");
        while (!"q".equals(nazwa)) {
            System.out.println("podaj nazwe uztywkonika");
            nazwa = scanner.nextLine();
            if(!"q".equals(nazwa)){
                System.out.println("podaj haslo uzytkownika");
                haslo = scanner.nextLine();
                uzytkownicy.put(nazwa,haslo);
            }
            else{
                System.out.println("przerwanie logowania");
            }
        }

        while (true) {
            System.out.println("Podaj jeszcze raz nazwe uzytkownika");
            pnazwa = scanner.nextLine();
            if(uzytkownicy.containsKey(pnazwa)){
                haslo = uzytkownicy.get(pnazwa);
                System.out.println("haslo tego uzytkownika to: " + haslo);
            }
            else{
                System.out.println("uzytkownik nie istnieje");
            }
        }
    }
}
