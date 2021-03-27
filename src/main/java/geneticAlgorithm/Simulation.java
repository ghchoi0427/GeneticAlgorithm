package geneticAlgorithm;

import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

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
            selectedGenes.add(new Gene());
        }
        return selectedGenes;
    }

    private List<Gene> recreateGeneration(List<Gene> oldGeneration) {
        List<Gene> newGeneration = new ArrayList<>();
        for (Gene gene : oldGeneration) {
            newGeneration.add(gene.mate(getPartner(oldGeneration, gene)));
        }
        return newGeneration;
    }

    private Gene getPartner(List<Gene> society, Gene loner) {
        Gene partner = society.get(RandomUtils.getRandomIndex(society.size()));
        if (partner.isIdentical(loner)) {
            return getPartner(society, loner);
        }
        return partner;
    }

    public void startSimulation() throws Exception {

        List<Gene> currentGeneration = createGeneration(10);
        parentCandidates(currentGeneration);

        //recreateGeneration(currentGeneration);
        //currentGeneration = recreateGeneration(currentGeneration);
        //currentGeneration.add(new Gene());

        //System.out.println(Roulette.turn(currentGeneration).getChromosome());
        //List<Integer> list = Roulette.getOverallFitness(currentGeneration);
        //list.stream().forEach(System.out::println);

    }
}
