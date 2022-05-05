package pl.edu.pw.elka.prm2t.lab5.zad2;

import java.io.*;
import java.util.Hashtable;
import java.util.TreeMap;

public class KeyValueData{

    public static void main(String[] arg) throws IOException {

        File file = new File("/home/mion/s/281/nslepowr/Desktop/PRM2T Lab/src/pl/edu/pw/elka/prm2t/lab5/zad2/paper.txt");
        FileReader filer = new FileReader(file);
        BufferedReader text = new BufferedReader(filer);

        TreeMap<String, String> s = new TreeMap<>();

        String line = null;
        String[] pom;
        while((line = text.readLine()) != null){
            line = line.replaceAll("\\s", " ");
            pom = line.split("=");
            s.put(pom[0],pom[1]);
        }
        System.out.println(s);

    }

}
