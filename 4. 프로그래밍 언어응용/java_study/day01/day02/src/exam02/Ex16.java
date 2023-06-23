package exam02;

public class Ex16 {
    public static void main(String[] args) {
        for (int i = 2; i <=9; i++) {

            System.out.println("------"+ i +"단 출력------");
            for(int j =1; j <= 9; j++) {
                if(j < i) {
                    continue;
                }
                System.out.println(i + "x" + j + "=" + (i*j));
            }
        }
    }

}
