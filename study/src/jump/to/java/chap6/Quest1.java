package jump.to.java.chap6;

import java.io.IOException;
import java.util.Scanner;

/**
 * 문제 1번
 * 두 개의 숫자를 입력받아 그 합을 출력하는 프로그램을 작성하시오.
 */
public class Quest1 {
    
    public static void main(String[] args) throws IOException {
        int x;
        int y;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력 >>>  ");
        x = sc.nextInt();
        System.out.print("두번째 숫자를 입력 >>>  ");
        y = sc.nextInt();
        System.out.printf("첫번째 숫자(x) : %d\n두번째 숫자(y) : %d\nx + y = %d", x , y, x + y);
        sc.close();
    }
}

