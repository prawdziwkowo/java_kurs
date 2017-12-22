package r05tablice;

import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
        int[] tablica  = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i*2;
        }

        for (int i: tablica) {
            System.out.print(i + " ");
        }

        int[] nowaTablica = {2, 6, 0, -1, 3, 5, 7, 9, 12, 1};

        Arrays.sort(nowaTablica);
        System.out.println();
        for (int i: nowaTablica) {
            System.out.print(i + " ");
        }

        int[][] tabMany = new int[3][3];
        for (int i = 0; i < tabMany.length; i++) {
            for (int j = 0; j < tabMany[i].length; j++) {
                tabMany[i][j] = (int)(Math.random() * 100);
            }
        }

        System.out.println();
        for (int i = 0; i < tabMany.length; i++) {
            for (int j = 0; j < tabMany[i].length; j++) {
                System.out.print(tabMany[i][j] + " ");
            }
            System.out.println();
        }

        int[][] tabUnsymetric = new int[4][];
        tabUnsymetric[0] = new int[5];
        tabUnsymetric[1] = new int[4];
        tabUnsymetric[2] = new int[3];
        tabUnsymetric[3] = new int[2];
        System.out.println();
        for (int i = 0; i < tabUnsymetric.length; i++) {
            for (int j = 0; j < tabUnsymetric[i].length; j++) {
                System.out.print(tabUnsymetric[i][j] + " ");
            }
            System.out.println();
        }
    }
}