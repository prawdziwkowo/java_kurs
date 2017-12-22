package r02;

public class MathUse {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.max(1, 5));
        System.out.println(Math.min(1, 5));
        System.out.println(Math.abs(-200));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.random());

        int losowa = (int)(Math.random() * 100);
        System.out.println(losowa);
        System.out.println(20000*3000000); //przeplnienie

        System.out.println(Math.multiplyExact(20000, 3000000)); //przeplnienie
    }
}
