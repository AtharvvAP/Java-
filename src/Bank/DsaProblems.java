package Bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public  class DsaProblems{
    public static void main(String[] args) {

        HashMap<Integer, Integer> seen = new HashMap<>();

        int arr[]={1,3,5,7,8};
        int target=8;

        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];
            if(seen.containsKey(complement)){
                System.out.println("Found" + complement + " + " + arr[i] + " = " + target);
            }
            seen.put(arr[i], i);
        }
    }
}