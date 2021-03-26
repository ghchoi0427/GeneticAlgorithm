import utils.RandomUtils;

public class Gene {
    private String chromosome;

    public Gene() {
        chromosome = generateGene();
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
}
