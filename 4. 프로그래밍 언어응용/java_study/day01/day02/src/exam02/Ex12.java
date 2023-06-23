package exam02;

public class Ex12 {
    public static void main(String[] args) {
        int a = 20;
        double b = 3.0;

        int result = (int)(a * b); //정답
        int result2 = a * (int)b;
        System.out.println(a*b);
    }
}
