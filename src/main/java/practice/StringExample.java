package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExample {
    public void indexOf() {
        String myStr = "Hello planet earth, you are a planet.";
        System.out.println(myStr.indexOf("planet",9));
    }
    public void showSubstring() {
        String str = "javaPoint";
        String subStr = str.substring(5,8);
        System.out.println(subStr);
    }

    public void showTrim() {
        String myStr = "       Hello World       ";
        System.out.println(myStr);
        System.out.println(myStr.trim());

    }

    public void formatMethod() {
        String name = "Saiful";
        int age = 20;
        int salary = 4000;

        System.out.println("My salary is " + salary + "and i am " + age + "years old and my name is " + name);
    }
    public void contains() {
        String myStr = "Hello";
        System.out.println(myStr.contains("ello"));
        System.out.println(myStr.contains("o"));
        System.out.println(myStr.contains("no"));
    }
    public void ConvertingArrayToList() {
        String [] array = {"Java","Python","PhP","C++"};
        System.out.println("Printing Array:" + Arrays.toString(array));

        //Converting Array to List

        List<String>list= new ArrayList<String>();
        for (String lang : array
        ) {
            list.add(lang);
        }
        System.out.println("Printing List: " + list);
    }
}
