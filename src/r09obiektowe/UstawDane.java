package r09obiektowe;

public class UstawDane {
    public static void main(String[] args) {
        Dane dane = new Dane();
        dane.setName("Grześ");
        dane.setAge(38);

        System.out.println("imie: " + dane.getName() + ", wiek: " + dane.getAge());

        Dane dane2 = new Dane("Gregory");
        System.out.println("imie: " + dane2.getName() + ", wiek: " + dane2.getAge());

        Dane dane3 = new Dane("Grzegosław", 21);
        System.out.println("imie: " + dane3.getName() + ", wiek: " + dane3.getAge());

        //zmieniajac obiekt w metodzie - zmieniamy go globalnie, bo jest przekazany prze referencje
        Test.change(dane);
        System.out.println("imie: " + dane.getName() + ", wiek: " + dane.getAge());

        System.out.println(add(5, 8));
        System.out.println(add(2.1, 3.4));
        System.out.println(add(1));
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3, 4));

        System.out.println(names());
        System.out.println(names("AAAA"));
        System.out.println(names("Ja", "Ty"));
    }

    private static int add(int a, int b) {
        return a + b;
    }
    private static double add(double a, double b) {
        return a + b;
    }
    private static int add(int a, int... list){
        int sum = a;
        for (int i: list) {
            sum += i;
        }
        return sum;
    }

    private static String names(String... names) {
        String out = "";
        for (String i: names) {
            out = out + i + " ";
        }
        return out;
    }
}
