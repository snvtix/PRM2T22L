package pl.edu.pw.elka.prm2t.lab4.zad2;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Scanner;

public class main {

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
                System.out.println(tab);
                System.out.println("by policzyc srednia ocen podaj x, by pominac podaj y");
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
                    continue;
                }
                studenci.put(nazwisko + " " + nrindeksu, tab);
                srednie.put(nazwisko, srednia);
            }
            else{
                System.out.println("koniec");
            }
        }
        System.out.println(studenci);
        System.out.println(srednie);
    }
}
