package testClasses;

public class Test {

    public static void passTest(Question[] questions) {
        // что можно, обойтись без него
        //убрать от сюда обращение к Questiron, но тогда как реализовать обработку вопросов,
        //как сюды передавать объекты другого класса?
        //возможно в моей реализации не нужен данный класс или тут будет один метод оп вызову метода из класса Question
        // Пока выкинула от сюдова все обрашения в классу Question, оставила ток вопросы
        int numberAnswer;
        int correctCount = 0;
        int countQuestion = questions.length;
        int wrongCount;
        int ask;
        int countAttempt = 0;
        int countAnswers = 0;
        //пред реализация
        /*UserInput uInput = new UserInput();

        for (Question q : questions) {
            System.out.println(q.getName());
            q.printAnswers();
            countAttempt = q.getTaskСomplexity() + 2;
            countAnswers = q.getLengthAnswers();
            numberAnswer = uInput.inputAnswer(countAttempt, countAnswers);
            if (numberAnswer == q.getNumberCorrectAnswer()) {
                correctCount ++;
                System.out.println("Правильно");
            } else {
                System.out.println("Неправильно");
            }
            System.out.println("------------------");
        }*/
        //новая реализация
        for (Question q : questions) {
            ask = q.askQuestion();
            if (ask == 1) {
              correctCount ++;
              System.out.println("Правильно");
            } else {
              System.out.println("Неправильно");
            }
            System.out.println("------------------");
        }

        wrongCount = countQuestion - correctCount;
        System.out.println("Всего вопросов " + countQuestion + ". Результатов: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
