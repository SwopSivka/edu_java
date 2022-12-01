package main.java.ru.tests.unit.fakes;

import main.java.ru.otus.game.GameWinnerPrinter;
import main.java.ru.otus.game.Player;

import java.util.List;

public class GameWinnerConsolePrinterStub implements GameWinnerPrinter {
    private List<String> actualFlow;

    public GameWinnerConsolePrinterStub(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }

    @Override
    public void printWinner(Player winner) {
        actualFlow.add(winner.getName());
    }

}
