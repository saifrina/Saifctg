package practice;

import org.w3c.dom.ls.LSOutput;

public class SplitArrayExample {
    public static void main(String[] args){
        //String name = "john, Ali, Mathew, Abraham";
       //String[] nameArray = name.split(",");
        //for (String person : nameArray) {
           // System.out.println("Person name is: " + person
            //);
       // }
        String sentence = "I live in NewYork";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println("Work is: " + word);
        }
        String reverse = "";
        for (int i = words.length - 1; i >= -0; i--) {
            reverse += words[i] + " ";

        }
        System.out.println("Sentence is :"  + reverse);
        String [] reverseWords = sentence.split(" ");
        System.out.println("5");
    }

}
