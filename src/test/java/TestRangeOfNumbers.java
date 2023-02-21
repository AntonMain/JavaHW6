import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaGroup.JavaQa.SqrtService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRangeOfNumbers {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Range.csv")
    void checkingTheRangeOfNumbers(int expected, int from, int before) {
        SqrtService service = new SqrtService();
        int actual = service.calculate(from, before);
        assertEquals(expected, actual);
    }
}