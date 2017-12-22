package r01;

public class Pojazd {
    String czyJedzie() {
        return "Pojazd jedzie";
    }

    public static void main(String[] args) {
        Pojazd samochod = new Pojazd();

        System.out.println(samochod.czyJedzie());
    }
}
