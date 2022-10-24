/**
 * @date 21/10/2022
 * @author Aleksandra Denisova
 */

import java.util.Scanner;

public class HmSystemTest {
    public static void main(String[] args)  {

        int correctCount = 0, wrongCount = 0;
        int numberAnswer;
        int lengthArrayAnswer;
        int checkAnswer;

        String[] questions = {
                "Вопрос №1: В файл с каким расширеним компилируется java-файл?",
                "Вопрос №2: Какой тип данных не относится к примитивным?",
                "Вопрос №3: С помощью какой команды git можно отправить изменения в удаленный репозиторий?"
        };

        String[][] answers = {
                {"1. exe", "2. java", "3. class", "4. dll"},
                {"1. byte", "2. string", "3. double"},
                {"1. put", "2. pull", "3. push"}
        };

        Integer[] correctAnswersNumber = {3, 2, 3};

        Scanner sc = new Scanner(System.in);
        byte controlNumberAnswer;

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            lengthArrayAnswer = answers[i].length;
            for (int j = 0; j < lengthArrayAnswer; j++) {
                System.out.println(answers[i][j]);
            }

            checkAnswer = 0;
            controlNumberAnswer = 0;
            do {
                if (checkAnswer > 3) {
                    wrongCount++;
                    System.out.println("Доступные попытки ответа на вопрос были исчерпаны!");
                    break;
                }
                System.out.print("Ваш ответ: ");
                checkAnswer++;
                numberAnswer = sc.nextInt();
                if (numberAnswer > 0 & numberAnswer <= lengthArrayAnswer) {
                    if (numberAnswer == correctAnswersNumber[i]) {
                        System.out.println("Правильно");
                        correctCount++;
                        controlNumberAnswer = 1;
                    } else {
                        System.out.println("Неправильно");
                        wrongCount++;
                        controlNumberAnswer = 1;
                    }
                } else {
                    System.out.println("Введите номер ответа от 1 до " + lengthArrayAnswer);
                    controlNumberAnswer = 0;
                }
            } while (controlNumberAnswer == 0);
            System.out.println("-------------");
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }

}