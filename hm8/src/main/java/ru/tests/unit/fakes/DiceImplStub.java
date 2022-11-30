package main.java.ru.tests.unit.fakes;

import main.java.ru.otus.game.Dice;

public class DiceImplStub implements Dice {
    @Override
    public int roll() {
        return 5;
    }
}
