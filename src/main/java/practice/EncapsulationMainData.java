package practice;

public class EncapsulationMainData {
    public static void main(String[]args) {
        Encapsulation obj = new Encapsulation();
        obj.getGeekName();
        obj.getGeekRoll();
        obj.getGeekAge();

        System.out.println("Name =" + obj.getGeekName());
        System.out.println("Age =" + obj.getGeekAge());
        System.out.println("Roll ="+ obj.getGeekRoll());
    }
}
