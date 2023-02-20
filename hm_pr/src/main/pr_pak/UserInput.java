package main.pr_pak;

import java.util.*;

public class UserInput {

    public Integer readInt() {
        int numberAnswer;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число:");
        while (true) {
            try {
                numberAnswer = sc.nextInt();
                return numberAnswer;
            } catch (InputMismatchException e) {
                System.out.println("Введено некорректное значение! Повторите ввод:");
                sc.next();
            }
        }
    }

    public String readCurrency(Set<String> arrValue) {
        String str;
        String strCurrency = "";
        boolean temp;
       // Set<String> langs = myCur.;

        //Set<Integer> keys = passportsAndNames.keySet();
        //langs.add("рубль");
        //langs.add("доллар");

        for (String s: arrValue)
            strCurrency = strCurrency + s + "; ";
        strCurrency = strCurrency.substring(0, strCurrency.length() - 2);

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите валюту (" + strCurrency +"):");
        while (true) {
            try {
                str = sc.nextLine();
                String finalStr = str;
                temp = arrValue.stream().anyMatch(lang -> lang.equals(finalStr));
                if (!temp) {
                    throw new RuntimeException();
                }
                return str;
            } catch (Exception e) {
                System.out.println("Введено некорректное значение строки! Повторите ввод:");
               // sc.next();
            }
        }
    }
}

