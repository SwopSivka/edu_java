package hm5SortBubble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.stream.Collectors;

public class Main {
    static final Integer MIN_NUMBER = 0;
    static final Integer MAX_NUMBER = 999999;
    static final Integer COUNT_NUMBER = 10000;
    static final Integer PRINT_COUNT_NUMBER = 15;

    private static ArrayList<Integer> createArrayIntUser(Integer minNumber, Integer maxNumber, Integer countNumber) {
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
        int range = maxNumber - minNumber + 1;
        int num;
        for (int i = 0; i < countNumber; i++) {
            num = (int)(Math.random() * range) + (int)(minNumber * Math.random());
            arrayInt.add(num);
        }
        return arrayInt;
    }

    private static ArrayList<Integer> copyArray(ArrayList<Integer> arrayOriginal) {
        ArrayList<Integer> arrayInt = new ArrayList<Integer>(arrayOriginal.size());
        for (Integer a : arrayOriginal) {
            arrayInt.add(a);
        }
        return arrayInt;
    }

    private static void printArrayInt(ArrayList<Integer> arrayInt, Integer countElement) {
        int countNumber;
        countNumber = (countElement > 0) ? countElement : arrayInt.size();
        for (int i = 0; i < countNumber; i++) {
            System.out.print(arrayInt.get(i) + " ");
            if (i > 0 & (i % 25) == 0) {
                System.out.println();
            }
        }
        System.out.println("...");
    }

    private static ArrayList<Integer> sortBubbleArray(ArrayList<Integer> arrayListInt) {
        int n = arrayListInt.size();
        int temp;
        for (int k = n-1; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                if (arrayListInt.get(i) > arrayListInt.get(i + 1)) {
                    temp = arrayListInt.get(i);
                    arrayListInt.set(i, arrayListInt.get(i + 1));
                    arrayListInt.set(i + 1, temp);
                }
            }
        }
        return arrayListInt;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayIntUser = createArrayIntUser(MIN_NUMBER, MAX_NUMBER, COUNT_NUMBER);
        System.out.println("Сформирован список из " + COUNT_NUMBER + " элементов");
        System.out.println("Вывод несортированного массива c 1 по " + PRINT_COUNT_NUMBER + " элемент");
        printArrayInt(arrayIntUser, PRINT_COUNT_NUMBER);
        System.out.print("\n\r");
        ArrayList<Integer> copyArrayIntUser = copyArray(arrayIntUser);

        long start  = new Date().getTime();
        arrayIntUser = sortBubbleArray(arrayIntUser);
        long end  = new Date().getTime();
        long runTime = end - start;

        System.out.println("Время сортировки методом Пузырька = " + runTime + " мс.");
        System.out.println("Вывод отсортированного массива");
        printArrayInt(arrayIntUser, PRINT_COUNT_NUMBER);
        System.out.print("\n\r");

        start = new Date().getTime();
        Collections.sort(copyArrayIntUser);
        end  = new Date().getTime();
        runTime = end - start;

        System.out.println("Время сортировки методом Java 'Collections.sort' = " + runTime + " мс.");
        System.out.println("Вывод отсортированного массива Java");
        printArrayInt(copyArrayIntUser, PRINT_COUNT_NUMBER);
    }
}