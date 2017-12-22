package r09obiektowe;

public class Boss extends Worker {
    int bonus;

    Boss(int bonus) {
        this.bonus = bonus;
    }

    public Boss(String name, String surname, int salary, int bonus) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }
}
