package main.pr_pak;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyCurrency {
    private final HashMap<String, String[]> myCurrency ;

    public MyCurrency() {
        this.myCurrency = new HashMap<>();
        this.myCurrency.put("рубль", new String[] {"рубль", "рубля", "рублей"});
        this.myCurrency.put("доллар", new String[] {"доллар", "доллара", "долларов"});
    }

    public String nameForm(String name, Integer nForm) {
        String res;
        try {
            res = myCurrency.get(name)[nForm-1];
            return res;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.printf("Нет формы \"%d\" для валюты \"%s\". Ошибка \"%s\" %n", nForm-1, name, e.getMessage());
            return "";
        } catch (NullPointerException e) {
            System.err.printf("Нет заданной валюты \"%s\". Ошибка \"%s\" %n", name, e.getMessage());
            return "";
        }
    }

    @Override
    public String toString() {
        String[] arrayStr;
        String str;
        for (Map.Entry<String, String[]> entry: myCurrency.entrySet()) {
            System.out.print(entry.getKey() + ": ");

            arrayStr = entry.getValue();
            str = "";
            for (int i = 0; i < Arrays.stream(arrayStr).count(); i++) {
                str = str + arrayStr[i] + ", ";
            }
            System.out.print(str.substring(0, str.length() - 2));
            System.out.println();
        }
        return null;
    }

    public Set<String> getMyCurrKey() {
        return myCurrency.keySet();
    }

}
