package Bank;

import java.util.*;

public  class DsaProblems{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String s1=sc.nextLine();

        System.out.print("Enter 2nd string : ");
        String s2=sc.nextLine();

        HashMap<Character, Integer> map1 =new HashMap<>();
        HashMap<Character, Integer> map2 =new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            char ch=s1.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }
            else {
                map1.put(ch, 1);
            }
        }
        for(int i=0; i< s2.length(); i++){
            char ch=s2.charAt(i);
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch)+1);
            }
            else {
                map2.put(ch, 1);
            }
        }
        System.out.println(map1);
        System.out.println(map2);

        System.out.println("--------------------------------");

        if(map1.equals(map2)){
            System.out.println("It is valid anagram");
        }
        else {
            System.out.println("It is not anagram");
        }
    }
}