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

    private static int getFitnessSum(List<Gene> geneList){
        return geneList.stream().mapToInt(e->e.getFitness()).sum();
    }

    public static void turn(List<Gene> geneList) {
        //int sum = getOverallFitness(geneList).stream().mapToInt(Integer::intValue).sum();

        int pinpoint = RandomUtils.getRandomPercentage() % sum;

        for(Gene gene : geneList){
            pinpoint -= gene.getFitness();
            if(pinpoint<0){
                return gene;
            }
        }


        List<Integer> fitnessList = getOverallFitness(geneList);

        for(int i : fitnessList){

        }


        for (int i : geneList) {
            fitnessSum += i;
        }
    }
}
