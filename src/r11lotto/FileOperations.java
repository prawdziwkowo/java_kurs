package r11lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileOperations {
    void searchNumbers(BufferedReader bufferedReader) throws IOException {
        String str;
        int[] tabl = checkListNumbers();
        Arrays.sort(tabl);
        while((str = bufferedReader.readLine()) != null) {
            int[] numbers = getLottoNumbersFromString(str);
            Boolean isEquals = Arrays.equals(numbers, tabl);
            if (isEquals) {
                printMessage("Znaleziono. Data losowania " + getDate(str));
            }
        }
    }

    private int checkNumber(BufferedReader bufferedReader) throws IOException {
        boolean isProper = false;
        int j = 0;
        do {
            try {
                j = Integer.parseInt(bufferedReader.readLine());
                if (j < 1 || j > 49) {
                    throw new InvalidNumber();
                } else {
                    isProper = true;
                }
            } catch (NumberFormatException e) {
                printError("Niekurwa właściwa liczba");
            } catch (InvalidNumber e) {
                printError("Liczba poza zakurwiesem");
            }
        } while (!isProper);

        return j;
    }

    public int[] checkListNumbers() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        printMessage("Podaj liczby 1-49: ");
        int[] tab = new int[6];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = checkNumber(bufferedReader);
        }

        return tab;
    }

    int[] getLottoNumbersFromString(String str) {
        String[] tab = str.substring(str.lastIndexOf(" ") + 1).split(",");

        int[] numbers = new int[6];

        for (int i = 0; i < tab.length; i++) {
            numbers[i] = Integer.parseInt(tab[i]);
        }

        Arrays.sort(numbers);

        return numbers;
    }

    String getDate(String str) {
        return str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" ") + 1);
    }

    void printError(String str) {
        System.err.println(str);
    }

    void printMessage(String str) {
        System.out.println(str);
    }
}
