package tests.unit;

import main.pr_pak.*;
import assertions.Assertions;

public class SpellNumberIntTest {

    public void SpellNumberIntTest1() {
        MyCurrency myCurrency;
        myCurrency = new MyCurrency();
        String scenario = "Тест №1: Проверка ожидаемого вывода числа и валюты";
        String [][] arrValueTest = {
                {"14522", "рубль", "14522 рубля"},
                {"5", "гривна", "5 гривень"},
                {"11", "рубль", "11 рублей"},
                {"1", "рубль", "1 рубль"},
                {"0", "рубль", "0 рублей"},
                {"-1223345", "рубль", "-1223345 рублей"}
        };
        SpellVar myVar = new SpellNumberInt();
        String myNumberStr;
        for (int i = 0; i < arrValueTest.length; i++) {
            try {
                myNumberStr = myVar.spelledNumber(Integer.parseInt(arrValueTest[i][0]), arrValueTest[i][1], myCurrency);
                Assertions.assertEquals(arrValueTest[i][2], myNumberStr);
                System.out.printf("\"%s\" - успешно, ожидаемый результат \"%s\" %n", scenario, arrValueTest[i][2]);
            } catch (Throwable e) {
                System.err.printf("\"%s\" - сообщение об ошибке \"%s\" %n", scenario, e.getMessage());
            }
        }
    }

}
