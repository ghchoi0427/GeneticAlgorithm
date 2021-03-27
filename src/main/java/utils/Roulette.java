package utils;

import geneticAlgorithm.Gene;
import geneticAlgorithm.Simulation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Roulette {

    private Roulette(){}

    public static List<Integer> getOverallFitness(List<Gene> geneList) {
        List<Integer> fitnesses = new ArrayList<>();
        for(Gene gene : geneList){
            fitnesses.add(gene.getFitness());
        }
        return fitnesses.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static void turn(List<Gene> geneList) {
        int fitnessSum = 0;

        Integer sum = geneList.stream().mapToInt(Integer::intValue).sum();
        for (int i : geneList) {
            fitnessSum += i;
        }
    }
}
