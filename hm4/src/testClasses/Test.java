package testClasses;

public class Test {

    public void passTest(Question[] questions) {
        int numberAnswer;
        int correctCount = 0;
        int countQuestion = questions.length;
        int wrongCount;
        int countAttempt = 0;
        int countAnswers = 0;
        UserInput uInput = new UserInput();

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
        }

        wrongCount = countQuestion - correctCount;
        System.out.println("Всего вопросов " + countQuestion + ". Результатов: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
