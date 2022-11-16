package hm5SortBubble;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    static final Integer MIN_NUMBER = 0;
    static final Integer MAX_NUMBER = 199999;
    static final Integer COUNT_NUMBER = 10000;
    static final Integer PRINT_COUNT_NUMBER = 15;

    public static void main(String[] args) {
        UserArray myArray = new UserArrayInt();
        ArrayList<Integer> arrayIntUser = myArray.createRandomArray(MIN_NUMBER, MAX_NUMBER, COUNT_NUMBER);
        myArray.printArrayFirstElements(arrayIntUser, PRINT_COUNT_NUMBER);
        System.out.print("\n\r");
        ArrayList<Integer> copyArrayIntUser = myArray.createCopyArray(arrayIntUser);

        long runTime;
        runTime = myArray.sortBubbleArrayMS(arrayIntUser);
        System.out.println("Время сортировки методом Пузырька = " + runTime + " мс.");
        myArray.printArrayFirstElements(arrayIntUser, PRINT_COUNT_NUMBER);
        System.out.print("\n\r");

        long start = new Date().getTime();
        Collections.sort(copyArrayIntUser);
        long end  = new Date().getTime();
        runTime = end - start;
        System.out.println("Время сортировки методом Java 'Collections.sort' = " + runTime + " мс.");
        myArray.printArrayFirstElements(copyArrayIntUser, PRINT_COUNT_NUMBER);
    }
}