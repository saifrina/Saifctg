package practice;
//Recursion is the technique of making a function call itself. this technique provides a way
//to break complicated problems down into simple problems which are easier to solve.
// Recursion may be a bit difficult to understand when encountering it for the first time, the best way
//to figure out how it works is to experiment with it.

//Example : Adding two numbers together is easy to do, but adding a range of numbers is more complicated.
//In the following example, recursion is used to add a range of numbers together by breaking it down into the simple
//task of adding two numbers.
    //very common interview questions...
// It is an algorithm to reduce the lines...

//Note: 1. Base Case. k=0 -> Sum=0
//Note: 2. Update,
//We are trying to add all the numbers from 1 to 100,
import java.util.Map;

public class Recursion {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }

    }
    public static void main(String[] args) {

        int result = sum(10);
        System.out.println(result);


    }
}
