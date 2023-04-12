package practice;
// encapsulation allows us to protect the data stored in a class from system-wide access. As its name suggests
// it safeguards the internal contents of a class like a real life capsule. To protect the data we can
// use public, private and protected keyword that define the accessibility on those properties.



public class Encapsulation {

    private String geekName;
    private int geekRoll;
    private int geekAge;

    // Getter method
    public int getGeekAge() {
        return geekAge;
    }
    public String getGeekName() {
        return geekName;
    }

    public int getGeekRoll() {
        return geekRoll;
    }

    //    Setter Method
    public void setGeekName(String newName) {
        geekName = newName;
    }

    public void setGeekRoll(int newRoll) {
        geekRoll = newRoll;

    }

    public void setGeekAge(int newAge) {
        geekAge = newAge;
    }

}
