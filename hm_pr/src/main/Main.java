package main;

import main.pr_pak.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Число с указанием валюты");
        int userValue;
        String nameCurrency;
        SpellVar myVar = new SpellNumberInt();
        MyCurrency myCurrency;
        myCurrency = new MyCurrency();

        nameCurrency = new UserInput().readCurrency(myCurrency.getMyCurrKey());
        userValue = new UserInput().readInt();

        String myNumberStr = myVar.spelledNumber(userValue, nameCurrency, myCurrency);
        System.out.println("Вывод: " + myNumberStr);
    }
}