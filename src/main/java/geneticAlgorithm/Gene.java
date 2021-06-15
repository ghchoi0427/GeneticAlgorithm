package geneticAlgorithm;

import utils.RandomUtils;

import java.util.stream.IntStream;

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
        StringBuilder chromosome = new StringBuilder();
        final int chromosomeLength = 8;
        for (int i = 0; i < chromosomeLength; i++) {
            chromosome.append(RandomUtils.getRandomBinary());
        }
        return chromosome.toString();
    }

    public Gene mate(Gene partnerGene) {
        return new Gene(recreateChromosome(getChromosome(), partnerGene.getChromosome()));
    }

    private String recreateChromosome(String chromosome1, String chromosome2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chromosome1.length(); i++) {
            if (RandomUtils.getRandomBoolean()) {
                sb.append(chromosome1.toCharArray()[i]);
            } else {
                sb.append(chromosome2.toCharArray()[i]);
            }
        }
        return sb.toString();
    }

    public int getFitness() {
        return (int) chromosome.chars().filter(e -> e == '1').count();
    }

    private int getFitness(String chromosome) {
        int value = Integer.parseInt(chromosome, 2);
        return 15 * value - value * value;
    }

    public int getMaxFitness() {
        return IntStream.range(0, (int) Math.pow(2, chromosome.length()))
                .mapToObj(e -> intToChromosome(e))
                .mapToInt(param -> getFitness(param))
                .max()
                .getAsInt();
    }

    private String intToChromosome(int decimal) {
        return String.format("%" + getChromosome().length() + "s", Integer.toBinaryString(decimal)).replace(' ', '0');
    }

    public boolean isIdentical(Gene gene) {
        return this.equals(gene);
    }

}
