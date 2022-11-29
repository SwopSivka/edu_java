package testClasses;

public class HmTestClasses {
    public static void main(String[] args) {
        //Заполнение вопросов для теста
        String[] Answers1 = {"exe", "java", "class", "dll"};
        Question question1  = new Question("В файл с каким расширеним компилируется java-файл?", 1, Answers1, 3);

        String[] Answers2 = {"byte", "string", "double", "class"};
        Question question2 = new Question("Вопрос №2: Какой тип данных не относится к примитивным?", 2, Answers2, 2);

        String[] Answers3 = {"put", "pull", "push"};
        Question question3 = new Question("Вопрос №3: С помощью какой команды git можно отправить изменения в удаленный репозиторий?", 1, Answers3, 3);

        Question[] questions = {question1, question2, question3};
        Test test1 = new Test(questions);
        test1.passTest();
    }
}