package testClasses;

public class Question {
    private String name;
    private Integer taskСomplexity;
    private Answer[] answers ;
    private Integer numberCorrectAnswer;

    public Question () {
        this.name = null;
        this.taskСomplexity = 1;
    }
    public Question (String name, Integer taskСomplexity, Answer[] answers, Integer numberAnswer) {
        this.name = name;
        this.taskСomplexity = taskСomplexity;
        this.answers = answers;
        this.numberCorrectAnswer = numberAnswer;
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
    public void setAnswers(Answer[] answerQuestion) {
        this.answers = answerQuestion;
    }
    public void printAnswers() {
        for (int i = 1; i <= this.answers.length; i++) {
            System.out.println(i + ". " + this.answers[ i - 1 ].getTextAnswer());
        }
    }
    public int getLengthAnswers() {
        return this.answers.length;
    }
    public void setNumberCorrectAnswer(Integer numberAnswer) {
        this.numberCorrectAnswer = numberAnswer;
    }
    public Integer getNumberCorrectAnswer() {
        return this.numberCorrectAnswer;
    }
}
