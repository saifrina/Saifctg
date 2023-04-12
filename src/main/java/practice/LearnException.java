package practice;

public class LearnException {
    public void subtraction() {
        int[] number = {1, 2};
        int result = number[0] - number[1];
        System.out.println("Subtraction:" + result);
    }
    public void summation() {
        try {
            int[] number = {1, 2};
            int result = number[2] + number[1];
            System.out.println("Summation:" + result);
        } catch (Exception e) {
            System.out.println("Encountered exception: " + e.getMessage());
        }
    }
    public void multiplication() {
        int[] number = {1, 2};
        int result = number[0] * number[1];
        System.out.println("Multiplication:" + result);
    }

    public static void main(String[] args) {
        LearnException le = new LearnException();
        le.subtraction();
        le.multiplication();
        le.summation();


    }

}
