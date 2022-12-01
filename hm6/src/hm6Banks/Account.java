package hm6Banks;

public class Account {
    private int numberAccount;
    private int goldCoins;

    public Account(int numberAccount, int goldCoins){
        this.numberAccount = numberAccount;
        this.goldCoins = goldCoins;
    }

    @Override
    public String toString() {
        return "Счет № " + numberAccount + "; кол-во золотых монет " + goldCoins;
    }

}
