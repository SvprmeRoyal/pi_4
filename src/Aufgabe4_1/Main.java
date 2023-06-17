package Aufgabe4_1;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {


String datei = "daten.txt";

FileReader reader = new FileReader(datei);

BufferedReader lese = new BufferedReader(reader);

int laenge = Integer.parseInt(lese.readLine());
Mensch [] a  = new Mensch [laenge];
String name = lese.readLine();
double groesse = Double.parseDouble(lese.readLine());
int alter = Integer.parseInt(lese.readLine());
Mensch human = new Mensch(name, groesse, alter);
human.Print();
       // System.out.println(name);

/*try {

}catch (FileNotFoundException e) {
    System.out.println("Fehler aufgetreten");
}
        System.out.println("Lesen Sie eine Datei ein");


*/
    }
}