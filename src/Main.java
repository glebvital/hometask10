import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "hello world!";
        String s2 = "rob";
//        Q0
//        System.out.println(wordcount(s));
//        System.out.println(Q1(s));
//        System.out.println(Q2(s));
//        Q3
//        if (Q3(s)){
//            System.out.println("polidrom");
//        }else {
//            System.out.println("not polidrom");
//        }

//        System.out.println(Q4(s));
//        Q5(s);
//        System.out.println(Q6(s));
//        System.out.println(Q7(s));
//        Q8                           my fav one :)
//        if (Q8(s,s2)){
//            System.out.println("is anagram");
//        }else {
//            System.out.println("isn't anagram");
//        }
    }
    public static int wordcount(String s){
        int count = s.split("\\s").length;
        return count;
    }
    public static String Q1(String s){
        String reversed = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
    public static int Q2(String s){
        s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }
    public static boolean Q3(String s){
        s = s.toLowerCase().replaceAll("//s","");
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static String Q4(String s){
        Set<Character> charset = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            charset.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : charset) {
            result.append(c);
        }
        return result.toString();
    }
    public static void Q5(String s){
        String[] ar = s.split(" ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    public static String Q6(String s){//that question already was before, but i'll try it in another way ;)
        StringBuilder reverse = new StringBuilder(s);
        reverse.reverse();
        return reverse.toString();
    }
    public static String Q7(String s){
        String[] ar = s.split("\\s");
        StringBuilder builder = new StringBuilder();
        for (String word : ar){
            if(!word.isEmpty()){
                builder.append(Character.toUpperCase(word.charAt(0)));
                builder.append(word.substring(1));
                builder.append(" ");

            }
        }
        return builder.toString();
    }
    public static boolean Q8(String s,String s2){

        char[] sAr = s.toCharArray();
        char[] sAr2 = s2.toCharArray();
        Arrays.sort(sAr);
        Arrays.sort(sAr2);
        return Arrays.equals(sAr,sAr2);
    }

    //s.equals(s2); - checks if variables are same inside.
    //s.contains("word"); - checks if there is any WORD inside of text, word to search sets inside of function.
    //s.contains('w'); - checks if there is any CHARACTER inside of text, character to search sets inside of function.
    //s.indexOf("word"); - checks if there is word what is needed to search, if there is so function will return idex where that word is.
    //s.toLowerCase/toUpperCase(); - changes string to lower/upper case.
    //s.split(""); - gives array with words, inside of function is the split element.
    //s.substring(0,1); - cuts space beetween ids inside function.

}