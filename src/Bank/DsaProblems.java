package Bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public  class DsaProblems{
    public static void main(String[] args) {

    int arr1[]={1,3,5,7,9};
    int arr2[]={2,4,6,8};

    int i=0;
    int j=0;
    int k=0;

    int result[]=new int[arr1.length + arr2.length];

    while(i< arr1.length && j<arr2.length){
        if(arr1[i] < arr2[j]){
            result[k]=arr1[i];
            i++;
        }
        else{
            result[k]=arr2[j];
            j++;
        }
        k++;
    }
    while (i<arr1.length){
        result[k]=arr1[i];
        i++;
        k++;
    }
    while (j< arr2.length){
        result[k]=arr2[j];
        j++;
        k++;
    }
    for(int num : result){
        System.out.print(num + " ");
    }
    }
}