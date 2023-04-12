package practice;
//this is child class or sub class.
//How to use or how to make the connection, java has this key word "extends" Bicycle

public class MountainBike extends Bicycle {
    public int seatHeight;

    public void setSeatHeight(int newValue) {
        seatHeight = newValue;

    }
    //at MountainBike we can also add or update a constructor,
    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;

    }
    //Both bicycle and mountain bike have common method "toString" but in MountainBike we just customise method
    //We just added one method and one variable in MountainBike.

    public String toString() {
        return (super.toString()+ " , Seat Height is " + seatHeight);

    }


}
