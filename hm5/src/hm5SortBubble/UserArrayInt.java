package hm5SortBubble;

import java.util.ArrayList;
import java.util.Date;

public class UserArrayInt implements UserArray {

    @Override
    public ArrayList<Integer> createRandomArray(Integer minValue, Integer maxValue, Integer countValue) {
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
        int range = maxValue - minValue + 1;
        int tempValue;
        for (int i = 0; i < countValue; i++) {
            tempValue = (int)(Math.random() * range) + (int)(minValue * Math.random());
            arrayInt.add(tempValue);
        }
        return arrayInt;
    }

    @Override
    public ArrayList<Integer> createCopyArray(ArrayList<Integer> originalArray) {
        ArrayList<Integer> copyArray = new ArrayList<Integer>(originalArray.size());
        for (Integer a : originalArray) {
            copyArray.add(a);
        }
        return copyArray;
    }

    @Override
    public void printArrayFirstElements(ArrayList<Integer> myArray, Integer countElementPrint) {
        System.out.println("Вывод массива c 1 по " + countElementPrint + " элемент");
        for (int i = 0; i < countElementPrint; i++) {
            System.out.print(myArray.get(i) + " ");
            if (i > 0 & (i % 25) == 0) {
                System.out.println();
            }
        }
        if (countElementPrint < myArray.size()) {
            System.out.println("...");
        }
    }

    @Override
    public long sortBubbleArrayMS(ArrayList<Integer> myArray) {
        int n = myArray.size();
        int temp;
        long start = new Date().getTime();
        for (int k = n-1; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                if (myArray.get(i) > myArray.get(i + 1)) {
                    temp = myArray.get(i);
                    myArray.set(i, myArray.get(i + 1));
                    myArray.set(i + 1, temp);
                }
            }
        }
        long end = new Date().getTime();
        long runTime = end - start;
        return runTime;
    }
}
