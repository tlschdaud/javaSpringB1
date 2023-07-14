package exam;

public class Exam1 {
    static boolean[] PrimeNumber = new boolean[1001];
    public static void main(String[] args) {

        Prime(1000);

        for(int i = 2 ; i < PrimeNumber.length ; i++) {
            if(!PrimeNumber[i]) {
                System.out.println(i);
            }
        }
    }

    public static void Prime(int N) {
        for(int i = 2 ; i < Math.sqrt(N) ; i++) {
            if(PrimeNumber[i]) continue;
            for(int j = i * i ; j <= N ; j += i) {
                PrimeNumber[j] = true;
            }
        }
    }
}
