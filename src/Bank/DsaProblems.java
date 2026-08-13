package Bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public  class DsaProblems{
    public static void main(String[] args) {

        HashSet<Integer> map = new HashSet<>();

        int arr[]={1, 2, 2, 3, 1, 2, 4, 3, 3};

        System.out.println("========================");

        for(int num : arr){
            if(map.contains(num)){
                System.out.println("Numbers are : " + num);
            }
            else {
                map.add(num);
            }
        }
    }
}