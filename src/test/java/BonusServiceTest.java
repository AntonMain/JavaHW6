import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // Расчёт бонуса для зарегистрированного пользователя.
        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
        System.out.println(expected + "=?" + actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        // Проверка лимитного значения бонуса для зарегистрированного пользователя.
        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
        System.out.println(expected + "=?" + actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // Расчёт бонуса для незарегистрированного пользователя.
        // подготавливаем данные:
        long amount = 1000;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
        System.out.println(expected + "=?" + actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        // Проверка лимитного значения бонуса для незарегистрированного пользователя.
        // подготавливаем данные:
        long amount = 1000000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
        System.out.println(expected + "=?" + actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndFalseLimit() {
        BonusService service = new BonusService();
        // Крайнее значение для получения максимального бонуса незарегистрированного клиента 50000/100*1>=500.
        // подготавливаем данные:
        long amount = 50000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
        System.out.println(expected + "=?" + actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndTrueLimit() {
        BonusService service = new BonusService();
        // Крайнее значение для получения максимального бонуса зарегистрированного клиента 16667/100*3>=500.
        // подготавливаем данные:
        long amount = 16667;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
        System.out.println(expected + "=?" + actual);
    }
}