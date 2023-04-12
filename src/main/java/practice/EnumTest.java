package practice;

public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;

    }

    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad");
                break;
            case FRIDAY:
                System.out.println("Friday are better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("Weekdays are so-so");
                break;
        }
    }

    public static void main(String[] args) {
        String str = "SATURDAY";
        EnumTest t1 = new EnumTest(Day.valueOf(str));
        t1.dayIsLike();
    }
}
