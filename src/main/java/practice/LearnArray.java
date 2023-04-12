package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnArray{
    public void StringArray() {
        String[] myList = {"Florida","California","Georgia","Texas"};
        //System.out.println(myList[2]);

        for (int x = 0; x < myList.length; x++) {
            System.out.println("States name is:" + myList[x]);
        }
    }

    //Sort Array
    public void sortArray() {
        String[] states = {"Florida","California","Georgia","Texas"};
        Arrays.sort(states);
        System.out.println(Arrays.toString(states));
    }

    public void sortArrayInDescendingOrder() {
        String[] states = {"Florida","California","Georgia","Texas"};
        Arrays.sort(states, Collections.reverseOrder());
        System.out.println(Arrays.toString(states));

    }




}
