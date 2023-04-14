package jump.to.java.chap9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quest5 {

    /**
     * 문제 4번
     * 
     * 사용자로부터 2~9의 숫자 중 하나를 입력받아 해당 숫자의 구구단을 한 줄로 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2~9의 숫자 중 하나를 입력하세요 >>>");
        int num = 0;
        try {
             num = sc.nextInt();
             if (num <= 1 || num >= 10) {
                 System.out.print("2~9의 숫자가 아닙니다.");
             } else {
                 for (int i = 1; i < 10; i++) {
                     System.out.printf("%d ", i * num);
                 }
             }
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        } finally {
            sc.close();
        } 
    }
}
