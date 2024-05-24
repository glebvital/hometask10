import java.util.*;

public class Main {
    public static void main(String[] args) {
        Questions questions = new Questions();
        String s = "hello world!";
        String s2 = "rob";
//        Q0
//        System.out.println(questions.wordcount(s));

//        System.out.println(questions.Q1(s));
//        System.out.println(questions.Q2(s));

//        Q3
//        if (questions.Q3(s)){
//            System.out.println("polidrom");
//        }else {
//            System.out.println("not polidrom");
//        }

//        System.out.println(questions.Q4(s));
//        questions.Q5(s);
//        System.out.println(questions.Q6(s));
//        System.out.println(questions.Q7(s));
//        Q8                           my fav one :)
        if (questions.Q8(s,s2)){
            System.out.println("is anagram");
        }else {
            System.out.println("isn't anagram");
        }
    }


    //s.equals(s2); - checks if variables are same inside.
    //s.contains("word"); - checks if there is any WORD inside of text, word to search sets inside of function.
    //s.contains('w'); - checks if there is any CHARACTER inside of text, character to search sets inside of function.
    //s.indexOf("word"); - checks if there is word what is needed to search, if there is so function will return idex where that word is.
    //s.toLowerCase/toUpperCase(); - changes string to lower/upper case.
    //s.split(""); - gives array with words, inside of function is the split element.
    //s.substring(0,1); - cuts space beetween ids inside function.

}