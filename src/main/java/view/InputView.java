package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class InputView {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int[] inputSettings() throws Exception{
        String[] line = bufferedReader.readLine().split(",");
         return Stream.of(line).mapToInt(Integer::parseInt).toArray();
    }
}
