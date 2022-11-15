package testClasses;

public class Question {
    private final String name;
    private final Integer taskСomplexity;
    private final String[] answers;
    private final Integer numberCorrectAnswer;
    private final UserInput uInput = new ConsoleUserInput();
    private final UserOutput uOutput = new ConsolesUserOutput();

    public Question (String name, Integer taskСomplexity, String[] answers, Integer numberAnswer) {
        this.name = name;
        this.taskСomplexity = taskСomplexity;
        this.answers = answers;
        this.numberCorrectAnswer = numberAnswer;
    }

    public void printAnswers() {
        for (int i = 1; i <= answers.length; i++) {
            uOutput.printMessage(i + ". " + answers[ i - 1 ]);
        }
    }

    public Integer askQuestion() {
        int res;
        System.out.println(name);
        this.printAnswers();
        int countAttempt = taskСomplexity + 2;
        int countAnswers = answers.length;
        int numberAnswer = uInput.read(countAttempt, countAnswers, 0);
        if (numberAnswer == numberCorrectAnswer) {
            res = 1 ;
        } else {
            res = 0;
        }
        return res;
    }
}
