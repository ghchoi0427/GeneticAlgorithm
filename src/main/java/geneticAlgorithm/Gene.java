package geneticAlgorithm;

import utils.RandomUtils;

public class Gene {
    private final String chromosome;

    public Gene() {
        chromosome = generateChromosome();
    }

    public Gene(String inheritedGene) {
        chromosome = inheritedGene;
    }

    public String getChromosome() {
        return chromosome;
    }

    private String generateChromosome() {
        String chromosome = "";
        final int chromosomeLength = 8;
        for (int i = 0; i < chromosomeLength; i++) {
            chromosome += RandomUtils.getRandomBinary();
        }
        return chromosome;
    }

    public Gene mate(Gene partnerGene) {
        int divisionPoint = RandomUtils.getDivisionPoint(getChromosome().length());
        return new Gene(recreateGene(getChromosome(), partnerGene.getChromosome(), divisionPoint));
    }

    private String recreateGene(String chromosome1, String chromosome2, int divisionPoint) {
        return chromosome1.substring(0, divisionPoint) + chromosome2.substring(divisionPoint, chromosome1.length());
    }

    public int getFitness() {
        return (int) chromosome.chars().filter(e -> e == '1').count();
    }

    public boolean isIdentical(Gene gene){
        return this.equals(gene);
    }

}
