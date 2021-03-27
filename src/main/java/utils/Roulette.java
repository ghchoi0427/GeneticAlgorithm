package utils;

import geneticAlgorithm.Gene;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Roulette {

    private Roulette() {
    }

    public static List<Integer> getOverallFitness(List<Gene> geneList) {
        List<Integer> fitnesses = new ArrayList<>();
        for (Gene gene : geneList) {
            fitnesses.add(gene.getFitness());
        }
        return fitnesses.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    private static int getFitnessSum(List<Gene> geneList) {
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
