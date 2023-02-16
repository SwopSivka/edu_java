package main.pr_pak;

public class SpellNumberInt implements SpellVar {
    @Override
    public String spelledNumber(Integer num, String nameCurrency, MyCurrency myCurr) {
        Integer varLength;
        String numStr;
        numStr = num.toString();
        Integer numForm;
        Integer numTemp;

        varLength = numStr.length();
        numForm = 0;
        if (varLength >= 2) {
            numTemp = Integer.parseInt("" + numStr.charAt(varLength-2) + numStr.charAt(varLength-1));
            if (numTemp >= 11 && numTemp <=14) {
                numForm = 3;
            }
        }
        if (numForm == 0) {
            numTemp = Integer.parseInt("" + numStr.charAt(varLength - 1));
            switch (numTemp) {
                case 1:
                    numForm = 1;
                    break;
                case 2, 3, 4:
                    numForm = 2;
                    break;
                default:
                    numForm = 3;
                    break;
            }
        }
        numStr = numStr + " " + myCurr.nameForm(nameCurrency, numForm);
        return numStr;
    }
}
