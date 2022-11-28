package hm6Banks;

import java.util.*;

public class UserMapBank {


    public void HashMapPut(HashMap<Account, Client> mapKey, HashMap<Client, HashSet<Account>> mapValue, Account key, Client value) {
        mapKey.put(key, value);

        HashSet<Account> listAcc = new HashSet<>();
        if (mapValue.containsKey(value)) {
        listAcc = mapValue.get(value);
        }
        listAcc.add(key);
        mapValue.put(value, listAcc);
    }

}
