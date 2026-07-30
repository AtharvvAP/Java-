package Bank;

import java.util.HashMap;

public class DsaProblems {
    public static void main(String[] args) {
        int arr[]={10,99,666,223,448};
        int target=109;

        HashMap<Integer, Integer>seen=new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int complement=target - arr[i];
            if(seen.containsKey(complement)){
                System.out.println("Found " + complement + " + " + arr[i] + " = " +target);
            }
            seen.put(arr[i], i);
        }
    }
}
