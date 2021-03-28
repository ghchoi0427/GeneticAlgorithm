package view;

import geneticAlgorithm.Gene;
import utils.Roulette;

import java.util.List;
import java.util.NoSuchElementException;

public class OutputView {

    private OutputView() {

    }

    private static final String MESSAGE_AVERAGE_FITNESS = "average fitness: ";

    public static void averageFitness(List<Gene> geneList) {
        int IdealFitnessSum = geneList.get(0).getChromosome().length() * geneList.size();
        int currentFitnessSum = Roulette.getFitnessSum(geneList);

        System.out.println(MESSAGE_AVERAGE_FITNESS + (float) (currentFitnessSum * 100 / IdealFitnessSum) + "%");
    }

    public static void generationIndicator(int index) {
        System.out.println("[Generation " + index + "]");
    }

    public static void getTheFittest(List<Gene> geneList) {
        System.out.println("The Fittest: " + geneList
                .stream()
                .mapToInt(e -> e.getFitness())
                .max()
                .orElseThrow(NoSuchElementException::new) + "/" + geneList.get(0).getChromosome().length());
    }
}
