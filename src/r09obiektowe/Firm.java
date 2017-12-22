package r09obiektowe;

public class Firm {
    public static void main(String[] args) {
        Worker worker = new Worker("a", "b", 3000);
        System.out.println("imię: " + worker.name + ", nazwisko: " + worker.surname + ", wypłata: " + worker.salary);

        Boss boss = new Boss(100);
        System.out.println("imię: " + boss.name + ", nazwisko: " + boss.surname + ", wypłata: " + boss.salary + ", premia: " + boss.bonus);
    }
}
