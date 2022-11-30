package main.java.ru.tests.unit.fakes;

import main.java.ru.otus.game.Dice;

public class DiceImplStub2 implements Dice {
    private Integer countRun = 1;
    @Override
    public int roll() {
        return countRun++;
    }
}
