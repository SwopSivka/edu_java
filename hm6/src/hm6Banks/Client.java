package hm6Banks;

public class Client {
    private final String numberPassport;
    private final String nameClient;
    private int age;

    public Client(String numberPassport, String nameClient, int age){
        this.numberPassport = numberPassport;
        this.nameClient = nameClient;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (numberPassport == o.toString()){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Номер паспорта - " + numberPassport + ", ФИО - " + nameClient + ", возраст - " +age;
    }

}
