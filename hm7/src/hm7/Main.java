package hm7;
import java.io.FileNotFoundException;

public class Main {
    private static final int INITIAL_VALUE = 15;
    public static void main(String[] args) {
        int userValue;
        int numRes;
        userValue = new UserInput().read();
        try {
            numRes = new UserMathOperation().UserDivision(INITIAL_VALUE, userValue);
            System.out.println("Округленный результат деления значений " + INITIAL_VALUE + " и " + userValue + " равен " + numRes);
            try (UserSaveFile file = new UserSaveFile("C:1.txt")) {
                file.WriteFile(numRes);
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка: Файл не найден!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на 0!");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
