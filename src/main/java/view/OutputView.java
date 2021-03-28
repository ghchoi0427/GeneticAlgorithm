package view;

import geneticAlgorithm.Gene;
import utils.Roulette;

import java.util.List;

public class OutputView {

    private static final String MESSAGE_AVERAGE_FITNESS = "average fitness rate: ";

    public static void averageFitness(List<Gene> geneList) {
        int IdealFitnessSum = geneList.get(0).getChromosome().length() * geneList.size();
        int currentFitnessSum = Roulette.getFitnessSum(geneList);

        System.out.println(MESSAGE_AVERAGE_FITNESS + (float) (currentFitnessSum * 100 / IdealFitnessSum) + "%");
    }
}
