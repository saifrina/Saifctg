package practice;
//Parameter List: When ever we think about parameters list we have to consider three things
//1. Number of parameters,
//2.Data type of parameters,
//3.Orders of parameters based on Data type
//**Method overriding have to happen in a subclass not in a same class.


public class Sum {
    public int sum(int x, int y) {
        return x+y;
    }

    public int sum(int x, int y, int z) {
        return x+y+z;
    }

    public int sum(int x, int y, double z) {
        return x+y;
    }
    public int sum(int x, double z, int y) {
        return x+y;
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10, 20, 30.9));
        System.out.println(s.sum(10, 20.6, 30));


    }
}
