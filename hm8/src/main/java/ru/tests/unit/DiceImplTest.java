package main.java.ru.tests.unit;

import main.java.ru.otus.game.Dice;
import main.java.ru.otus.game.DiceImpl;

import java.util.HashSet;
import java.util.Set;

public class DiceImplTest {
    private final Dice dice = new DiceImpl();
    public void DiceImplEntryRangeRandomTest1() {
        String scenario = "Тест №1, для класса DiceImpl: единичная проверка рандомного значения, оно должно быть от 1 до 6 включительно";
        try {
            int valueDice = dice.roll();
            if ((valueDice <  1) || (valueDice > 6)) {
                throw new RuntimeException("Получили значение " + valueDice + ", оно не входит в диапозон [1..6]");
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public  void DiceImplValueQualityRandomTest2() {
        final Integer COUNT_VALUE_TEST = 10;
        final Integer TEST_PASS_THRESHOLD = 55;
        String scenario = "Тест №2, для класса DiceImpl: серия тестов из " + COUNT_VALUE_TEST + " значений, на проверки уникальности рандомных значений, минимальный порог уникальных значений = " + TEST_PASS_THRESHOLD + "% ";
        Set<Integer> testSet = new HashSet<>();
        Integer percentMatch;
        try {
            for (int i = 0; i < COUNT_VALUE_TEST; i++ ) {
                testSet.add(dice.roll());
            }
            percentMatch = Math.round((100 * testSet.size()) / COUNT_VALUE_TEST);
            if (percentMatch < TEST_PASS_THRESHOLD) {
                throw new RuntimeException("Полученное значение равняется " + percentMatch + "%");
            }
            scenario = scenario + " Результат уникален на "+ percentMatch + "%";
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }


}
