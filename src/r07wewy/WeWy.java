package r07wewy;

import java.util.Scanner;

public class WeWy {
    public static void main(String[] args) {
        String imie;
        Scanner in = new Scanner(System.in);

        System.out.println("Jakie miano Ci nadano");
        imie = in.nextLine();
        System.out.println("Czyżbyś to był ty " + imie + "? A uczysz Ty się javy ile dni już?");

        int dni = in.nextInt();
        if (dni < 10) {
            System.out.println("Ty wymoczku");
        } else {
            System.out.println("Jesteś wyjadaczem");
        }
    }
}
