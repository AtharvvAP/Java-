package Bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public  class DsaProblems{
    public static void main(String[] args) {

//        HashMap<Integer, Integer> seen = new HashMap<>();

        int arr[]={1,3,0,12,0,7,4,0,55,141};
        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j; i<arr.length; i++){
            arr[i]=0;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}