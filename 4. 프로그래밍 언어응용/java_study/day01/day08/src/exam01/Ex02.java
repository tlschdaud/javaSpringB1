package exam01;

public class Ex02 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;

            int result = num1 / num2; // throw new ArithmeticException(...);

            System.out.println(result);
            System.out.println("실행 코드");

        } catch (ArithmeticException e) {
            String message = e.getMessage();
            System.out.println(message);
            //e.printStackTrace();
        }
        System.out.println("중요한");

    }
}
