package pl.edu.pw.elka.prm2t.lab4.zad2;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class main {

    public static void srednia(Hashtable<String, int[]>){
        Hashtable<String, int[]> slownik = new Hashtable<>();
        String key;
        for(key in slownik.keys()){

        }
    }

    public static void main(String[] arg) {

        String nazwisko = null;
        String nrindeksu = null;
        int[] tab = new int[5];
        Scanner scanner = new Scanner(System.in);
        Hashtable<String, int[]> student = new Hashtable<>();

        System.out.println("Podaj dane studentow, by przerwac podaj q");
        while (!"q".equals(nazwisko)) {
            System.out.println("podaj nazwisko studenta");
            nazwisko = scanner.nextLine();
            if(!"q".equals(nazwisko)) {
                System.out.println("podaj nr indeksu");
                nrindeksu = scanner.nextLine();
                System.out.println("podaj ostatnie 5 ocen studenta");
                for (int i = 0; i < 5; i++) {
                    String str = scanner.nextLine();
                    int pom = Integer.parseInt(str);
                    tab[i] = pom;
                }
                student.put(nazwisko + nrindeksu, tab);
            }
            else{
                System.out.println("koniec");
            }
        }


    }
}
