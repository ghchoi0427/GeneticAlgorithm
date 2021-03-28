package utils;

import geneticAlgorithm.Gene;

import java.util.List;

public class Roulette {

    private Roulette() {
    }

    public static int getFitnessSum(List<Gene> geneList) {
        return geneList.stream().mapToInt(e -> e.getFitness()).sum();
    }

    public static Gene turn(List<Gene> geneList) {
        int sum = getFitnessSum(geneList);
        int pinpoint = RandomUtils.getRandomPercentage() % sum;

        for (Gene gene : geneList) {
            pinpoint -= gene.getFitness();
            if (pinpoint < 0) {
                return gene;
            }
        }
        return null;
    }
}
