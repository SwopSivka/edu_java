package main.java.ru.tests.unit;

import main.java.ru.otus.game.*;
import main.java.ru.tests.unit.fakes.*;
import main.java.ru.assertions.Assertions;

import java.util.ArrayList;
import java.util.List;


public class GameTest {

    public void GameEqualRandomValueTest3() {
        String scenario = "Тест №3, для класса Game: проверка события с одинаковыми значениями броска кубика, победителя быть не должно, ожидается 'ничья' ";
        List<String> actualFlow = new ArrayList<>();
        Dice dice = new DiceImplStub();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinterStub(actualFlow);
        Game game = new Game(dice, winnerPrinter);
        try {
            game.playGame(new Player("Вася"), new Player("Игорь"));
            for (String s : actualFlow) {
                Assertions.assertEquals("ничья", s);
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void GameWinnerTryTest4() {
        String scenario = "Тест №4, для класса Game: Контролируемая кость, ожидаемый победитель игрок №2";
        List<String> actualFlow = new ArrayList<>();
        Dice dice = new DiceImplStub2();
        GameWinnerPrinter winnerPrinter = new GameWinnerConsolePrinterStub(actualFlow);
        Game game = new Game(dice, winnerPrinter);
        try {
            game.playGame(new Player("Вася"), new Player("Игорь"));
            for (String s : actualFlow) {
                Assertions.assertEquals("Игорь", s);
            }
            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
