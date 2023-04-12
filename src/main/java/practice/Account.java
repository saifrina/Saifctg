package practice;
//Keyword THIS is a reference variable in Java that refers to the current object.
//this key word in Java
public class Account {


    int a;
    int b;

    public void setData(int a, int b) {
       this.a  = a;
        this.b = b;

    }

    public void showData() {
        System.out.println("Value of A= " + a);
        System.out.println("Value of B= " + b);

    }

}
