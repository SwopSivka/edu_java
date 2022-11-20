package hm5SortBubble;

import java.util.ArrayList;

public interface UserArray {

    ArrayList<Integer> createRandomArray(Integer minValue, Integer maxValue, Integer countValue);

    ArrayList<Integer> createCopyArray(ArrayList<Integer> originalArray);

    void printArrayFirstElements(ArrayList<Integer> myArray, Integer countElementPrint);

    long sortBubbleArrayMS(ArrayList<Integer> myArray);

}
