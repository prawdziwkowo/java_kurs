package r10wyjatki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read2 {
    public static void main(String[] args) {
        int[] tab = {1, 4, 5, 6, 7, 8, 9};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int index = -1;

        System.out.println("Podaj elemencik");

        boolean isProper = false;
        while (!isProper) {
            try {
                index = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Bład parse int");
            } catch (IOException e) {
                System.out.println("Błąd IO");
            }
            isProper = index != -1;
        }

        try {
            System.out.println(tab[index - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("niepoprawny parametr");
        }
    }
}
