package hm7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    public Integer read() {
        final Integer MAX_ATTEMPTS_COUNT = 10;
        int numberAnswer;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите целое число больше 0:");
        while (true) {//for (int i = 0; i < MAX_ATTEMPTS_COUNT; i++) {
            try {
                numberAnswer = sc.nextInt();
                return numberAnswer;
            } catch (InputMismatchException e) {
                System.out.println("Введено некорректное значение! Повторите ввод:");
                sc.next();
            }
            //}
        }
    }
}
