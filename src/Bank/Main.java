package Bank;

import java.util.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> customers= new ArrayList<>();

        customers.add("aaaa");
        customers.add("bbbb");
        customers.add("cccc");
        customers.add("dddd");

        for(int i=0; i < customers.size(); i++){
            System.out.println(customers);
        }

        System.out.println(customers.get(3));

        System.out.println("Size " + customers.size());

        System.out.println(customers.remove(1));

        System.out.println(customers);
    }
}