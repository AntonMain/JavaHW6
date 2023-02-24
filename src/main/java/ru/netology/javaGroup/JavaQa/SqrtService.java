package ru.netology.javaGroup.JavaQa;

public class SqrtService {
    public int calculate(int x, int y) {
        int numberOfOccurences = 0;

        for (int i = 10; i <= 99; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                numberOfOccurences++;
            }
        }
        return numberOfOccurences;
    }
}
