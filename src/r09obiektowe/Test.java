package r09obiektowe;

public class Test {
    public static void change (Dane dane) {
        int age  = dane.getAge();
        dane.setAge(++age);
    }
}
