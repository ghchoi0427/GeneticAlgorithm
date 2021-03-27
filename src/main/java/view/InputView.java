package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputView {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static int inputNumber() throws Exception {
        return Integer.parseInt(bufferedReader.readLine());
    }
}
