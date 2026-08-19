package Bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public  class DsaProblems{
    public static void main(String[] args) {
//        String s="Hello";
//        String reversed="";
//
//        for(int i=s.length()-1; i>=0; i--){
//            reversed= reversed + s.charAt(i);
//        }
//        System.out.println(reversed);

        String s="hello";
        String reversed="";

        for(int i=s.length()-1; i>=0; i--){
            reversed +=s.charAt(i);
        }
        if(s.equals(reversed)){
            System.out.println("String is palindrome : " + reversed);
        }
        else {
            System.out.println("String is not palindrome : " + reversed);
        }
    }
}