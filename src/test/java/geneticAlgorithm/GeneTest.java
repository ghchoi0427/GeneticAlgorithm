package geneticAlgorithm;

import static org.junit.jupiter.api.Assertions.*;

class GeneTest {

    @org.junit.jupiter.api.Test
    void getMaxFitness() {
        Gene gene = new Gene();
        int MaxDecimal = (int) Math.pow(2, gene.getChromosome().length());
        for (int i = 0; i < MaxDecimal; i++) {
            System.out.println(String.format("%"+ gene.getChromosome().length() +"s", Integer.toBinaryString(i)).replace(' ','0'));
        }
    }
}