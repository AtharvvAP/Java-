package Bank;

import java.util.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        HashMap<String, String> accounts= new HashMap<>();

        accounts.put("1","9000000");
        accounts.put("2","95412532");
        accounts.put("3","21525555");

        System.out.println(accounts);

        System.out.println(accounts.get("2"));

        System.out.println(accounts.containsKey("5"));

        accounts.remove("2");

        System.out.println("Size : " + accounts.size());

        for(String key : accounts.keySet()){
            System.out.println(key + " -> " + accounts.get(key));
        }
    }
}