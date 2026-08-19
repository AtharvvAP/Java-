package Bank;

import java.util.*;

public  class DsaProblems{
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter String : ");
//        String s=sc.nextLine();
//
//        String reversed="";
//
//        for(int i=s.length()-1; i>=0; i--){
//            reversed= reversed + s.charAt(i);
//        }
//        System.out.println(reversed);

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String s=sc.nextLine();

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