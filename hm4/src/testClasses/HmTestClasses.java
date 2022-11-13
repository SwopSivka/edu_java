package testClasses;

public class HmTestClasses {
    public static void main(String[] args) {
        //Заполнение вопросов для теста
        Answer ans1 = new Answer("exe");
        Answer ans2 = new Answer("java");
        Answer ans3 = new Answer("class");
        Answer ans4 = new Answer("dll");
        Answer ans5 = new Answer("byte");
        Answer ans6 = new Answer("string");
        Answer ans7 = new Answer("double");
        Answer ans8 = new Answer("put");
        Answer ans9 = new Answer("pull");
        Answer ans10 = new Answer("push");

        Question question1  = new Question();
        question1.setName("В файл с каким расширеним компилируется java-файл?");
        question1.setTaskСomplexity(1);
        Answer[] Answers1 = {ans1, ans2, ans3, ans4}; // "1. exe", "2. java", "3. class", "4. dll"
        question1.setAnswers(Answers1);
        question1.setNumberCorrectAnswer(3);

        Answer[] Answers2 = {ans5, ans6, ans7, ans3}; // "1. byte", "2. string", "3. double"
        Question question2 = new Question("Вопрос №2: Какой тип данных не относится к примитивным?", 2, Answers2, 2);

        Answer[] Answers3 = {ans8, ans9, ans10}; //"1. put", "2. pull", "3. push"
        Question question3 = new Question("Вопрос №3: С помощью какой команды git можно отправить изменения в удаленный репозиторий?", 1, Answers3, 3);

        Test test1 = new Test();
        Question[] questions = {question1, question2, question3};
        test1.passTest(questions);

    }
}