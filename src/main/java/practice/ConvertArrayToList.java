package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String args[]) {
        //Creating Array
        String[] array = {"Java", "Python", "PhP", "C++"};
        System.out.println("Printing Array: "+ Arrays.toString(array));
        //Converting Arrays to List
        List<String> list = new ArrayList<String>();
        for (String lang:array) {
            list.add(lang);
        }
        System.out.println("Printing List:"+list);
    }
}
