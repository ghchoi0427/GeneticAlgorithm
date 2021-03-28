package view;

import geneticAlgorithm.Gene;
import utils.Roulette;

import java.util.List;

public class OutputView {

    public static void averageFitness(List<Gene> geneList){
        int IdealFitnessSum = geneList.get(0).getChromosome().length()* geneList.size();
        int currentFitnessSum = Roulette.getFitnessSum(geneList);

        System.out.println("average fitness rate: "+(float)(currentFitnessSum * 100 / IdealFitnessSum) + "%");
    }
}
