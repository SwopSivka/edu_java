package testClasses;

import java.util.Scanner;

public class ConsoleUserInput implements UserInput {

    @Override
    public Integer read(Integer countAttempts, Integer maxValue, Integer minValue) {
        Scanner sc = new Scanner(System.in);
        int controlNumberAnswer = 0;
        int checkAnswer = 1;
        int countTries = countAttempts + 2;
        int numberAnswer = 0;
        do {
            if (checkAnswer <= countTries) {
                System.out.print("Ваш ответ: ");
                while (!sc.hasNextInt() && checkAnswer <= countTries) {
                    checkAnswer++;
                    if (checkAnswer > countTries) {
                        numberAnswer = 0;
                        break;
                    }
                    System.out.println("Нормер ответа должен быть целым числом от 1 до " + maxValue + "!");
                    System.out.print("Ваш ответ: ");
                    sc.next();
                }
            }
            numberAnswer = sc.nextInt();

            if (checkAnswer > countTries) {
                System.out.println("Доступные попытки ответа на вопрос были исчерпаны!");
                controlNumberAnswer = 1;
                numberAnswer = 0;
            }
            if (numberAnswer == minValue || numberAnswer > maxValue) {
                System.out.println("Введите номер ответа от 1 до " + maxValue);
                checkAnswer++;
                controlNumberAnswer = 0;
            } else {
                controlNumberAnswer = 1;
            }
        } while (controlNumberAnswer == 0);
        return numberAnswer;
    }
}
