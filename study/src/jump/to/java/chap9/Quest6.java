package jump.to.java.chap9;

import java.util.Arrays;
import java.util.Scanner;

public class Quest6 {

    /**
     * 문제 6번
     * 
     * 사용자로부터 다음과 같은 숫자를 입력받아 입력받은 숫자의 총합을 구하는 프로그램을 작성하시오. (단 숫자는 콤마로 구분하여 입력한다.)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        String input = null;
        try {
             input = sc.nextLine();
             String[] inputs = input.split(",");
             int result = Arrays.stream(inputs).map(x->x.trim()).map(x->Integer.parseInt(x)).mapToInt(x->x).sum();
             System.out.printf("result = %d", result);
             
        } catch (Exception e) {
            System.out.println("에러 발생");
        } finally {
            sc.close();
        } 
    }
}
