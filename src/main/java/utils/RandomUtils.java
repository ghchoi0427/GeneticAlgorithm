package utils;

import java.util.Random;

public class RandomUtils {

    private RandomUtils() {
    }

    private final static int minimal_division_point = 1;

    private final static Random random = new Random();

    public static String getRandomBinary() {
        return String.valueOf(random.nextInt(2));
    }

    public static int getDivisionPoint(int geneLength) {
        return random.nextInt(geneLength - 1) + minimal_division_point;
    }

    public static int getRandomIndex(int size) {
        return random.nextInt(size);
    }

    public static int getRandomPercentage() {
        return random.nextInt(10001);
    }

    public static boolean mutate(int mutationRate) {
        return random.nextInt(100) < mutationRate;
    }
}
