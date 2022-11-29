package testClasses;

public class ConsolesUserOutput implements UserOutput{

    @Override
    public void printMessage(String sMessage) {
        System.out.println(sMessage);
    }
}
