package view;

import java.util.Scanner;

public class InputView {

    private InputView() {

    }

    private static final Scanner sc = new Scanner(System.in);
    private static final String INPUT_POPULATION = "input population: ";
    private static final String INPUT_GENERATION = "input generation: ";
    private static final String INPUT_MUTATION = "input mutation(%): ";

    public static int inputPopulation() {
        System.out.println(INPUT_POPULATION);
        return sc.nextInt();
    }

    public static int inputGeneration() {
        System.out.println(INPUT_GENERATION);
        return sc.nextInt();
    }

    public static int inputMutation() {
        System.out.println(INPUT_MUTATION);
        return sc.nextInt();
    }
}
