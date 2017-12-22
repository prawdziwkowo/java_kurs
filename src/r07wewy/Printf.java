package r07wewy;

public class Printf {
    public static void main(String[] args) {
        double x = -123456.1234;
        System.out.println(x);
        System.out.printf("%,(.3f", x);//grupujemy cyfry, liczby ujemne w nawias, tylko 3 miejsca po przecinku

        double y = 879876987.23;
        System.out.println();
        System.out.printf("%,+.4f", y);
    }
}
