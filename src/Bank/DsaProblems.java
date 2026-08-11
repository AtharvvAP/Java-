package Bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public  class DsaProblems{
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int arr[]={1, 2, 2, 3, 1, 2, 4, 3, 3};

//        for(int num : arr){
//            if(map.containsKey(num)){
//                map.put(num, map.get(num) + 1);
//            }
//            else {
//                map.put(num , 1);
//            }
//        }
//        System.out.println(map);

        System.out.println("=====================================");

        for(int num : arr){
            if(map.containsKey(num)){
                System.out.println("First duplicate : " + num);
                break;
            }
            else {
                map.put(num, num);
            }
        }
    }
}