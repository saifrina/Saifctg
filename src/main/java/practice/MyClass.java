package practice;

public class MyClass {
    //A constructor in Java is a special method that is used to initialize objects. The constructor is called
    //when an object of a class is created, It can be used to set initial values for object attributes.
    int a;
    int b;
    int c;
    int d;
    int e;

    public static void main(String[] args) {
        MyClass myObj = new MyClass();


        myObj.a = 10;
        myObj.b = 20;
        myObj.c = 30;
        myObj.d = 50;
        myObj.e = 60;


        System.out.println("a = "+myObj.a);
        System.out.println("b = "+myObj.b);
        System.out.println("c = "+myObj.c);
        System.out.println("d = "+myObj.d);
        System.out.println("e = "+myObj.e);
    }


}
