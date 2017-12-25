package r11lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Reader {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.mbnet.com.pl/dl.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        FileOperations fileOperations = new FileOperations();

        fileOperations.searchNumbers(in);

        in.close();

        System.out.println("Kooooniec");
    }
}
