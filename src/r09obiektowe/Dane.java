package r09obiektowe;

public class Dane {
    private String name;
    private int age;

    Dane() {
        name = "brak";
    }

    Dane(String name) {
        this.name = name;
    }

    Dane(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
