package Bank;

import java.util.*;

public  class DsaProblems{
    public static void main(String[] args) {

        String strings[]={"flower", "flow", "flowchart"};

        String shortest=strings[0];


        for(int i=1; i<strings.length; i++){
            if(strings[i].length() < shortest.length()){
                shortest=strings[i];
            }
        }
        System.out.println(shortest);

        System.out.println("--------------------------");

        String result="";

        for(int i=0; i<shortest.length(); i++){
            for(int j=0; j<strings.length; j++){
                if(shortest.charAt(i) != strings[j].charAt(i)){
                    System.out.println("Longest common prefix is  " + result);
                    return;
                }
            }
            result += shortest.charAt(i);
        }
        System.out.println("Longest common prefix is : " + result);
    }
}