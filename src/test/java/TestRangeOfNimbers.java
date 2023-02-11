import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRangeOfNimbers {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Range.csv")
    void checkingTheRangeOfNumbers(int expected, int from, int before) {
        Main service = new Main();
        int actual = service.calculate(from, before);
        assertEquals(expected, actual);
    }
}