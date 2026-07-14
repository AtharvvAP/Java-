package Bank;

import java.util.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
       HashMap<Integer, String> accounts=new HashMap<>();

       accounts.put(101,"AAAA");
       accounts.put(102,"BBBB");
       accounts.put(103,"CCCC");
       accounts.put(104,"DDDD");

        System.out.println(accounts);

        System.out.println(accounts.get(102));
        System.out.println(accounts.get(103));

        System.out.println(accounts.remove(104));

        if(accounts.containsKey(101)){
            System.out.println("It is existing in the records");
        }
        else{
            System.out.println("Not existed");
        }

        System.out.println(accounts.keySet());
    }
}