package jump.to.java.chap6;

import java.io.IOException;
import java.util.Scanner;

/**
 * 문제 1번
 * 영문을 입력하고 엔터를 입력하면 입력한 영문을 대문자로 변경하여 출력하는 프로그램을 작성하시오.
 * 
 * (단, 사용자가 "END" 라는 문자열을 입력하기 전까지 반복해서 문장을 입력받을 수 있게 할것)
 */
public class Quest2 {
    
    public static void main(String[] args) throws IOException {
        String input;
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            input = sc.nextLine().toUpperCase();
            System.out.println(input);
            if (input.equals("END")) {
                System.out.println("### 프로그램 종료 ###");
                sc.close();
                break;
            }            
        }        
    }
}

