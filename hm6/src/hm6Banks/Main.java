package hm6Banks;

import java.util.HashMap;
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

        HashMap<Account, Client> accounts = new HashMap<>();
        accounts.put(acc1, person1);
        accounts.put(acc2, person1);
        accounts.put(acc3, person3);
        accounts.put(acc4, person2);
        accounts.put(acc5, person3);

        System.out.println("Для " + acc2);
        System.out.println("Клиент: " + accounts.get(acc2) + "\n");

        System.out.println("Для клиента с номером паспорта 123456:");
        for (Map.Entry<Account, Client> entry: accounts.entrySet()) {
                if (entry.getValue().equals("123456")) {
                    System.out.println(entry.getKey());
            }
        }

    }
}