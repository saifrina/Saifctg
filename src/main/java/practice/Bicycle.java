package practice;
//This is our parent class , we have two variables, one constructor , and three methods.

public class Bicycle {
    public int gear;
    public int speed;

    public Bicycle() {
    }

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.gear = speed;

    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return ("No of gears are" + gear + ", Speed is " + speed);

    }
}
