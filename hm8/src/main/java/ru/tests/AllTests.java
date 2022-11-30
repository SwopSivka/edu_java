package main.java.ru.tests;

import main.java.ru.tests.unit.*;

public class AllTests {

    public static void main(String[] args) {
        new DiceImplTest().DiceImplEntryRangeRandomTest1();
        new DiceImplTest().DiceImplValueQualityRandomTest2();
        new GameTest().GameEqualRandomValueTest3();
        new GameTest().GameWinnerTryTest4();
    }

}
