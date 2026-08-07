package Bank;

import java.util.ArrayList;
import java.util.HashMap;

public  class DsaProblems{
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();


        ArrayList<String> cars =new ArrayList<>();
        map.put(1, new ArrayList<>());
        map.get(1).add("Mercedes");
        map.get(1).add("BMW");


        ArrayList<String> cars1=new ArrayList<>();
        map.put(2, new ArrayList<>());
        map.get(2).add("Porsche");
        map.get(2).add("Audi");

        ArrayList<String> cars2=new ArrayList<>();
        map.put(3, new ArrayList<>());
        map.get(3).add("Ferrari");
        map.get(3).add("Lamborghini");
        map.get(3).add("McLaren");

//        System.out.println(map);

        System.out.println(map.get(1));

        System.out.println(map.get(2));

        System.out.println(map.get(3));

        System.out.println(map.get(3).get(2));

        System.out.println(map.get(1).size());

        System.out.println(map.get(1).get(0));

//        System.out.println(map.get(1).get(0));
//
//        System.out.println(map.get(2));
//
//        System.out.println(map.get(2).get(1));


    }
}