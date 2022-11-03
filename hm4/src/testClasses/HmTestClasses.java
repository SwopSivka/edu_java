package testClasses;

import java.util.Scanner;

class Question {
    private String name;
    private Integer taskСomplexity;
    private AnswerOptions[] answers ;

    public Question () {
        this.name = null;
        this.taskСomplexity = 1;
    }
    public Question (String name, Integer taskСomplexity) {
        this.name = name;
        this.taskСomplexity = taskСomplexity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getTaskСomplexity() {
        return taskСomplexity;
    }
    public void setTaskСomplexity(Integer taskСomplexity) {
        this.taskСomplexity = taskСomplexity;
    }
    public void setAnswers(int countAnswer, String[] answerQuestion) {
       AnswerOptions[] answer = new AnswerOptions[countAnswer];
       for (int i = 0; i <= countAnswer - 1; i++) {
           answer[i] = new AnswerOptions(answerQuestion[i]);
       }
       this.answers = answer;
    }
    public void getAnswers() {
        for (int i = 0; i <= this.answers.length - 1; i++) {
            System.out.println(this.answers[i].getTextAnswer());
        }
    }
    public int getLengthAnswers() {
        return this.answers.length;
    }
    public void setAnswerCorrect(int numberAnswer, Byte prCorrect) {
        this.answers[numberAnswer-1].setInCorrect(prCorrect);
    }
    public int getAnswerIdCorrect() {
        int idCorrect = 0;
        for (int i = 0; i <= this.answers.length - 1; i++) {
            if (this.answers[i].getInCorrect() == (byte)1)  {
                idCorrect = i + 1;
                break;
            }
        }
        return idCorrect;
    }
}

class AnswerOptions {
    private String textAnswer;
    private Byte   inCorrect;

    public AnswerOptions(String text) {
        this.textAnswer = text;
        this.inCorrect = 0;
    }
    public AnswerOptions(String text, Byte sign) {
        this.textAnswer = text;
        this.inCorrect = sign;
    }
    public String getTextAnswer() {
        return textAnswer;
    }
    public void setTextAnswer(String text) {
        this.textAnswer = text;
    }
    public Byte getInCorrect() {
        return inCorrect;
    }
    public void setInCorrect(Byte sign) {
        //1 =3
        // верный
        this.inCorrect = sign;
    }
}

public class HmTestClasses {
    private static Boolean completeQuestion(Question question) {
        //вывод вопроса
        System.out.println(question.getName());
        question.getAnswers();

        //проверка ввода от пользователя
        Scanner sc = new Scanner(System.in);
        int controlNumberAnswer = 0;
        int checkAnswer = 1;
        int countTries = question.getTaskСomplexity() + 2;
        int lengthArrayAnswer = question.getLengthAnswers();
        int numberAnswer;
        Boolean res = false;

            do {
                if (checkAnswer <= countTries) {
                    System.out.print("Ваш ответ: ");
                    while ((!sc.hasNextInt()) && (checkAnswer <= countTries)) {
                        checkAnswer++;
                        if (checkAnswer > countTries) {
                            break;
                        }
                        System.out.println("Нормер ответа должен быть целым числом от 1 до " + lengthArrayAnswer + "!");
                        System.out.print("Ваш ответ: ");
                        sc.next();
                    }
                }
                if (checkAnswer > countTries) {
                    System.out.println("Доступные попытки ответа на вопрос были исчерпаны!");
                    res = false;
                    break;
                }
                numberAnswer = sc.nextInt();

                if (numberAnswer > 0 & numberAnswer <= lengthArrayAnswer) {
                    if (numberAnswer == question.getAnswerIdCorrect()) {
                        System.out.println("Правильно");
                        controlNumberAnswer = 1;
                        res = true;
                    } else {
                        System.out.println("Неправильно");
                        controlNumberAnswer = 1;
                        res = false;
                    }
                } else {
                    System.out.println("Введите номер ответа от 1 до " + lengthArrayAnswer);
                    checkAnswer++;
                    controlNumberAnswer = 0;
                }
            } while (controlNumberAnswer == 0);
            System.out.println("-------------");
        return res;
    }

    public static void main(String[] args) {
        //Заполнение вопросов для теста
        Question question1  = new Question();
        question1.setName("В файл с каким расширеним компилируется java-файл?");
        question1.setTaskСomplexity(1);
        String[] ans1 = {"1. exe", "2. java", "3. class", "4. dll"};
        question1.setAnswers(4, ans1);
        question1.setAnswerCorrect(3, (byte)1);

        Question question2 = new Question("Вопрос №2: Какой тип данных не относится к примитивным?", 2);
        String[] ans2 = {"1. byte", "2. string", "3. double"};
        question2.setAnswers(3, ans2);
        question2.setAnswerCorrect(2, (byte)1);

        Question question3 = new Question("Вопрос №3: С помощью какой команды git можно отправить изменения в удаленный репозиторий?", 1);
        String[] ans3 = {"1. put", "2. pull", "3. push"};
        question3.setAnswers(3, ans3);
        question3.setAnswerCorrect(3, (byte)1);

        int correctCount = 0;
        int wrongCount = 0;
        int countQuestion = 3;

        correctCount = correctCount + (completeQuestion(question1) ? 1 : 0);
        correctCount = correctCount + (completeQuestion(question2) ? 1 : 0);
        correctCount = correctCount + (completeQuestion(question3) ? 1 : 0);

        wrongCount = countQuestion - correctCount;
        System.out.println("Всего вопросов " + countQuestion + ". Результатов: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}