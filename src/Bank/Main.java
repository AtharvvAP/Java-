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
            System.out.println(customers.get(i));
        }

        System.out.println(customers.get(3));

        System.out.println("Size " + customers.size());

        System.out.println(customers.remove(1));

        System.out.println(customers);

        if(customers.contains("aaaa")){
            System.out.println("It is true");
        }
        else {
            System.out.println("It is false");
        }

        System.out.println(customers.set(1,"EEEEE"));
        System.out.println(customers);
    }
}