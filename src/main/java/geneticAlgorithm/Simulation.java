package geneticAlgorithm;

import utils.RandomUtils;
import view.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Simulation {

    private List<Gene> createGeneration(int population) {
        List<Gene> generation = new ArrayList<>();
        for (int i = 0; i < population; i++) {
            generation.add(new Gene());
        }
        return generation;
    }

    private List<Gene> parentCandidates(List<Gene> generation) {
        List<Gene> selectedGenes = null;
        for (Gene g : generation) {
            selectedGenes.add(new Gene());
        }
        return selectedGenes;
    }

    private void recreateGeneration(List<Gene> oldGeneration) {
        List<Gene> newGeneration = null;
        for (Gene gene : oldGeneration) {
            newGeneration.add(gene.mate(getPartner(oldGeneration, gene)));
        }
        oldGeneration = newGeneration;
    }

    private Gene getPartner(List<Gene> society, Gene loner) {
        Gene partner = society.get(RandomUtils.getRandomIndex(society.size()));
        if (partner == loner) {
            return getPartner(society, loner);
        }
        return partner;
    }

    public List<Integer> getOverallFitness(List<Gene> geneList) {
        List<Integer> fitnesses = new ArrayList<>();
        for(Gene gene : geneList){
            fitnesses.add(gene.getFitness());
        }
        return fitnesses.stream().distinct().collect(Collectors.toList());
    }

    public void startSimulation() throws Exception {
        //Output
        int population = InputView.inputNumber();
        // Output
        int rep = InputView.inputNumber();
        // Output
        int mutation = InputView.inputNumber();


        List<Gene> currentGeneration = createGeneration(100);
        //Output(currentGeneration);

        for (int i = 0; i < rep; i++) {
            recreateGeneration(currentGeneration);
            //Output(currentGeneration);
        }

        //Output.finalReport();

    }
}
