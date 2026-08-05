package Bank;

public  class DsaProblems{
    public static void main(String[] args) {
        String s = "Java Programming";

        System.out.println("Length of string = " + s.length());

        System.out.println("Char at 8 = " + s.charAt(8));

        System.out.println("substring 11 = " +s.substring(11));

        System.out.println("Contains(\"Prog\") : " + s.contains("Prog"));

        System.out.println("starts with (\" Ja\") : " + s.startsWith(" Ja"));

        System.out.println("end with (\"ing \") : " + s.endsWith("ing "));

        System.out.println("Equals to " + s.equals("Programming"));

        System.out.println("equalsIgnoreCase (\"  java programming  \") : " + s.equalsIgnoreCase("java programming"));

        System.out.println("index of (n) : " + s.indexOf('n'));

        System.out.println("last index of (r) : " + s.lastIndexOf('r'));

        System.out.println("replaced : " + s.replace("Java", "Core Java"));

        System.out.println("replace all r with @ : " + s.replaceAll("r", "@"));

        System.out.println("to upper case : " + s.toUpperCase());

        System.out.println("to lower case : " + s.toLowerCase());

        System.out.println("triming " + s.trim());

        String[] words=s.trim().split(" ");
        System.out.println("split() : ");
        for(String word : words){
            System.out.println(word);
        }

        System.out.println("\"\".is Empty : " + "".isEmpty());

        System.out.println("\"   \".is Blank :" +"  ".isBlank());

    }
}