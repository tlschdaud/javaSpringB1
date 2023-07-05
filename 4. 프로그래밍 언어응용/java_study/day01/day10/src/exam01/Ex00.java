package exam01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n개 입력 받는 수 정수형으로 저장
        int[] ran = new int[n];//n만틈 배열 생성
        for(int i = 0 ; i < n ; i++) {//n개의 난수 설정
            ran[i] = (int)(Math.random()*100+1);//범위가 정해져 있지 않아 일단 1~100으로 설정
        }

        Arrays.sort(ran);//오름차순 정렬
        if(n%2==0) {//n이 짝수 일때 난수전체와 중간값 2개 출력
            int mid1 = ran[n/2];
            int mid2 = ran[n/2-1];
            for(int ans : ran) {
                System.out.println(ans);
            }
            System.out.println("mid = " + mid1 + "and mid = " + mid2);
        }
        else if(n%2!=0) {//n이 홀수 일때 난수 전체와 중간값 1개 출력
            int mid = ran[n/2];
            for(int ans : ran) {
                System.out.println(ans);
            }
            System.out.println("mid = " + mid);
        }

    }

}
