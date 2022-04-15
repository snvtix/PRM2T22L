package pl.edu.pw.elka.prm2t.lab4.zad2;

// [JW] Zad. 2: 0.5 / 3 p.

import java.util.Arrays;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        String nazwisko = null;
        String nrindeksu = null;
        int suma = 0;
        float srednia = 1;
        int[] tab = new int[5];
        Scanner scanner = new Scanner(System.in);
        Hashtable<String, int[]> studenci = new Hashtable<>();
        Hashtable<String, Integer> srednie = new Hashtable<>();

        System.out.println("Podaj dane studentow, by przerwac podaj q");
        while (!"q".equals(nazwisko)) {
            System.out.println("podaj nazwisko studenta");
            nazwisko = scanner.nextLine();
            if(!"q".equals(nazwisko)) {
                System.out.println("podaj nr indeksu");
                nrindeksu = scanner.nextLine();
                System.out.println("podaj ostatnie 5 ocen studenta");
                for (int i = 0; i < 5; i++) {
                    int pom1 = scanner.nextInt();
                    tab[i] = pom1;
                }
                System.out.println(Arrays.toString(tab));  // [JW] aby wyświetlić zawartość tablicy
                System.out.println("by policzyc srednia ocen podaj x, by pominac podaj y");
                // [JW] scanner.nextInt() przetwarza tylko liczbę, bez znaku końca linii, dlatego poniższe nextLine
                // wczytuje pusty String pozostały z poprzedniego wpisu użytkownika programu - zamiast czekać na nową
                // komendę. Żeby temu zapobiec można było np. używać powyżej Integer.parseInt(scanner.nextLine())
                // zamiast scanner.nextInt().
                String pom2 = scanner.nextLine();
                if("x".equals(pom2)){
                    for(int j: tab){
                        suma = suma + j;
                    }
                    Float.valueOf(suma);
                    srednia = suma/5;
                    System.out.println("srednia = " + srednia);
                }
                else{
                    // [JW] Komenda continue sprawia, że przechodzimy od razu do następnej iteracji - bez dopisania
                    // nowego studenta do listy poleceniem studenci.put(...)
                }
                studenci.put(nazwisko + " " + nrindeksu, tab);
//                srednie.put(nazwisko, srednia);
            }
            else{
                System.out.println("koniec");
            }
        }
        System.out.println(studenci);
        System.out.println(srednie);
    }
}
