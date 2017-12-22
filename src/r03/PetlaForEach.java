package r03;

public class PetlaForEach {
    public static void main(String[] args) {
        int[] tablica = new int[20];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i * 10;
        }

        for (int element : tablica) {
            System.out.print(element + " ");
        }
    }
}
