package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class RandomDemo {

    public static void main(String args[]){

    Random random = new Random();
    int randomNum1 = random.nextInt(500);
        System.out.println(randomNum1  );
        System.out.println();

        double randomDouble1 = random.nextDouble();
        System.out.println(randomDouble1);
    }
}
