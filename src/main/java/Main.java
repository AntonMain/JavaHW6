public class Main {
    public int calculate(int from, int before) {
        int numberOfOccurences = 0;

        for (; from < before; from++) {
            for (int i = 9; i < 99; i++) {
                if (i * i == from) {
                    numberOfOccurences++;
                    System.out.println(numberOfOccurences);
                }
            }
        }
        return numberOfOccurences;
    }
}