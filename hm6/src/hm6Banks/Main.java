package hm6Banks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Client person1 = new Client("123456", "Петрушкин Петр Федорович", 25);
        Client person2 = new Client("245671", "Евдокимова Фросия", 55);
        Client person3 = new Client("405789", "Жукова Никита Борисовна", 21);

        Account acc1 = new Account(12345, 10);
        Account acc2 = new Account(1432, 1000);
        Account acc3 = new Account(345, 15);
        Account acc4 = new Account(2345, 7);
        Account acc5 = new Account(15, 10);

        UserMapBank bank = new UserMapBank();
        HashMap<Client, HashSet<Account>> persons = new HashMap<>();
        HashMap<Account, Client> accounts = new HashMap<>();

        bank.HashMapPut(accounts, persons, acc1, person1);
        bank.HashMapPut(accounts, persons, acc2, person1);
        bank.HashMapPut(accounts, persons, acc3, person3);
        bank.HashMapPut(accounts, persons, acc4, person2);
        bank.HashMapPut(accounts, persons, acc5, person3);

        System.out.println("\n1) Вывод счетов для клиента. Для: " + person2);
        for (Account acc : persons.get(person2)) {
            System.out.println(acc);
        }

        System.out.println("\n2) Вывод клиента по счету. Для: " + acc2);
        System.out.println("Клиент: " + accounts.get(acc2) + "\n");

    }
}