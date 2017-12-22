package r08pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pliki {
    public static void main(String[] args) throws FileNotFoundException {
        File txt = new File("src/r08pliki/plik.txt");
        System.out.println(txt.length());
        System.out.println(txt.getFreeSpace());
        System.out.println(txt.canRead());
        System.out.println(txt.canWrite());

        Scanner read = new Scanner(txt);
        while (read.hasNextLine()) {
            System.out.println(read.nextLine());
        }

        PrintWriter writer  = new PrintWriter("src/r08pliki/write.txt");
        writer.println("cos tam zapisuje");
        writer.close();
    }
}
