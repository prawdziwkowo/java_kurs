package r02;

import java.math.BigInteger;

public class WielkieLiczby {
    public static void main(String[] args) {
        System.out.println(BigInteger.ONE);

        BigInteger wielkaLiczba = new BigInteger("1212121211222221122");
        System.out.println(wielkaLiczba.toString());

        BigInteger wielkaLiczba2 = BigInteger.valueOf(454545454);
        System.out.println(wielkaLiczba2.toString());

        BigInteger suma;
        suma = wielkaLiczba.add(wielkaLiczba2);
        System.out.println(suma.toString());

        BigInteger doPotegi = wielkaLiczba.pow(10);
        System.out.println(doPotegi);
        System.out.println(doPotegi.toString().length());

        BigInteger podzielona = doPotegi.divide(wielkaLiczba2);
        System.out.println(podzielona);
    }
}
