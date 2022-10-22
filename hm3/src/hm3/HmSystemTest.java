package hm3;

/**
 * @date 21/10/2022
 * @author Aleksandra Denisova
 */

import java.util.Scanner;


public class HmSystemTest {

    public static void main(String[] args)  {

        int correctCount = 0, wrongCount = 0;
        char kodeAnswer;

        String[][][] arrayTest;
        arrayTest = new String[][][] {                
            {
                {"Вопрос №1: В файл с каким расширеним компилируется java-файл?"},
                {"1. exe", "2. java", "3. class", "4. dll"},
                {"3"}
            },
            {
                {"Вопрос №2: Какой тип данных не относится к примитивным?"},
                {"1. byte", "2. string", "3. double"},
                {"2"}
            },
            {
                {"Вопрос №3: С помощью какой команды git можно отправить изменения в удаленный репозиторий?"},
                {"1. put", "2. pull", "3. push"},
                {"3"}
            }
        };

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arrayTest.length; i++) {
            for(int j = 0; j < arrayTest[i].length; j++) {
                for (int n = 0; n < arrayTest[i][j].length; n++) {
                    if (j != 2 | n != 0) {
                        System.out.println(arrayTest[i][j][n]);
                    }
                }
            }

            System.out.print("Ваш ответ: ");
            kodeAnswer = sc.next().charAt(0);  
            if (kodeAnswer == arrayTest[i][2][0].charAt(0)) {
                correctCount++;
                System.out.println("Правильно");
            } else {
                System.out.println("Неправильно");
                wrongCount++;
            }                
            System.out.println();
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
