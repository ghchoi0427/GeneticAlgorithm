package utils;

import java.util.Random;

public class RandomUtils {
    private final static Random random = new Random();

    public static String getRandomBinary(){
        return String.valueOf(random.nextInt(1));
    }
}
