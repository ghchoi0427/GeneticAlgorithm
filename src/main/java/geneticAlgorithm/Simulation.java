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

    private List<Gene> recreateGeneration(List<Gene> oldGeneration) {
        List<Gene> newGeneration = null;
        for (Gene gene : oldGeneration) {
            newGeneration.add(gene.mate(getPartner(oldGeneration, gene)));
        }
        return newGeneration;
    }

    private Gene getPartner(List<Gene> society, Gene loner) {
        Gene partner = society.get(RandomUtils.getRandomIndex(society.size()));
        if (partner == loner) {
            return getPartner(society, loner);
        }
        return partner;
    }
}
