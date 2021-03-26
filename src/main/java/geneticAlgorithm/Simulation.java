package geneticAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    public List<Gene> createGeneration(int population){
        List<Gene> generation = new ArrayList<>();
        for (int i = 0; i < population; i++) {
            generation.add(new Gene());
        }
        return generation;
    }

}
