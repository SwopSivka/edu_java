package hm7;

public class UserMathOperation {
    public Integer UserDivision (int value1, int value2) throws Exception {
        int resValue;
        int resMod;
        float resDivision;
        try {
            resMod = value1 % value2;
            if (resMod > 0) {
                throw new ClassCastException("Обработка вещественного числа");
            } else {
                resDivision = value1 / value2;
                resValue = (int) resDivision;
                return resValue;
            }
        } catch (ArithmeticException e ) {
            throw new ArithmeticException("Ошибка в UserMathOperation.UserDivision: " + e);
        } catch (ClassCastException e) {
            resDivision = (float) value1 / value2;
            resValue = Math.round(resDivision);
            return resValue;
        } catch (Exception e) {
            throw new Exception("Ошибка в UserMathOperation.UserDivision: " + e);
        }
    }


}
