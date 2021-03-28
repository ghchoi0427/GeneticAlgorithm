package geneticAlgorithm;

import utils.RandomUtils;
import utils.Roulette;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    public Simulation() {
    }

    private List<Gene> createGeneration(int population) {
        List<Gene> generation = new ArrayList<>();
        for (int i = 0; i < population; i++) {
            generation.add(new Gene());
        }
        return generation;
    }

    private List<Gene> parentCandidates(List<Gene> generation) {
        List<Gene> selectedGenes = new ArrayList<>();
        for (Gene g : generation) {
            selectedGenes.add(Roulette.turn(generation));
        }
        return selectedGenes;
    }

    private void mutateGene(List<Gene> geneList, int rate) {
        for (Gene gene : geneList) {
            if (RandomUtils.mutate(rate)) {
                gene = new Gene();
            }
        }
    }

    private List<Gene> recreateGeneration(List<Gene> oldGeneration, int mutationRate) {
        List<Gene> newGeneration = new ArrayList<>();
        oldGeneration = parentCandidates(oldGeneration);
        for (Gene gene : oldGeneration) {
            newGeneration.add(gene.mate(getPartner(oldGeneration, gene)));
        }
        mutateGene(newGeneration, mutationRate);
        return newGeneration;
    }

    private Gene getPartner(List<Gene> society, Gene loner) {
        Gene partner = society.get(RandomUtils.getRandomIndex(society.size()));
        if (partner.isIdentical(loner)) {
            return getPartner(society, loner);
        }
        return partner;
    }

    public void startSimulation() {

        final int population = InputView.inputPopulation();
        final int generation = InputView.inputGeneration();
        final int mutation = InputView.inputMutation();

        List<Gene> currentGeneration = createGeneration(population);

        OutputView.averageFitness(currentGeneration);
        for (int i = 0; i < generation; i++) {
            OutputView.generationIndicator(i);
            OutputView.getTheFittest(currentGeneration);
            currentGeneration = recreateGeneration(currentGeneration, mutation);
            OutputView.averageFitness(currentGeneration);
        }

    }
}
