package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputView {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int inputNumber() throws Exception {
        return Integer.parseInt(bufferedReader.readLine());
    }
}
