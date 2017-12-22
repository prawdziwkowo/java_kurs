package r09obiektowe;

public class Worker {
    String name;
    String surname;
    int salary;

    Worker() {
        name = "";
        surname = "";
        salary = 0;
    }

    Worker(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
}
