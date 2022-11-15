package testClasses;

public class Test {
    private final Question[] questions;
    private final UserOutput uOutput;
    public Test(Question[] questions) {
        this.questions = questions;
        this.uOutput = new ConsolesUserOutput();
    }

    public void passTest() {
        int correctCount = 0;
        int countQuestion = questions.length;
        int wrongCount;
        int ask;
        for (Question q : questions) {
            ask = q.askQuestion();
            if (ask == 1) {
              correctCount ++;
                uOutput.printMessage("Правильно");
            } else {
                uOutput.printMessage("Неправильно");
            }
            uOutput.printMessage("------------------");
        }

        wrongCount = countQuestion - correctCount;
        uOutput.printMessage("Всего вопросов " + countQuestion + ". Результатов: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
