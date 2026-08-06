package Bank;

import java.util.ArrayList;
import java.util.HashMap;

public  class DsaProblems{
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();


        ArrayList<String> cars =new ArrayList<>();
        cars.add("Mercedes");
        cars.add("BMW");
        map.put(1, cars);


        ArrayList<String> cars1=new ArrayList<>();
        cars1.add("Rolls Royce");
        cars1.add("Jaguar");
        map.put(2, cars1);

        System.out.println(map);

        System.out.println(map.get(1).get(0));

        System.out.println(map.get(2));

        System.out.println(map.get(2).get(1));


    }
}