package practice;
//There will be error but it will be more presentable to others, in java there is an tecnic that is called
// try{main code} catch(Exception e){sout(e)}
public class ExceptionHandlingExample {
    public static void main(String[] args) {

        //try-catch-block
        try {
            int[] num = {1, 2, 3, 4, 5};
            System.out.println(num[5]);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
