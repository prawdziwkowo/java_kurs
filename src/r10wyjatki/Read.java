package r10wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        Scanner read = new Scanner(System.in);

        System.out.println("Podaj indeks");


        try {
            int index = read.nextInt();
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Co Ty odpierdzielasz? ");
        } catch (InputMismatchException e) {
            System.out.println("Znowu odpierdzielasz");
        }
    }
}
