package exam09;

public class Outer {
    int num1 = 10;

    class Inner{
        int num1 = 20;
        static int num2 = 30;
        void method() {
            System.out.println(num1);
            System.out.println(Outer.this.num1);
            //outerMethod();
        }
    }

    public void outerMethod() {
        System.out.println("outerMethod");
    }
}
