package geneticAlgorithm;

import utils.RandomUtils;

public class Gene {
    private String chromosome;

    public Gene() {
        chromosome = generateGene();
    }

    public Gene(String inheritedGene) {
        chromosome = inheritedGene;
    }

    public String getChromosome() {
        return chromosome;
    }

    private String generateGene() {
        String result = "";
        for (int i = 0; i < 8; i++) {
            result += RandomUtils.getRandomBinary();
        }
        return result;
    }

    public Gene mate(Gene partnerGene) {
        int length = getChromosome().length();
        int divisionPoint = RandomUtils.getDivisionPoint(length);
        recreateGene(getChromosome(), partnerGene.getChromosome(), divisionPoint);

        return new Gene(recreateGene(getChromosome(), partnerGene.getChromosome(), divisionPoint));
    }

    private String recreateGene(String chromosome1, String chromosome2, int divisionPoint) {
        return chromosome1.substring(0, divisionPoint) + chromosome2.substring(divisionPoint, chromosome1.length());
    }

}
