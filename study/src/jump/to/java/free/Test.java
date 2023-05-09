package jump.to.java.free;

import java.util.Scanner;

/*
 * 1부터 n까지 진행되는 숫자들 중 3, 6, 9 가 들어가는 숫자는 *로 표시하기
 */
public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            String num = Integer.toString(i); // 문자열을 인덱스로 하나씩 읽어서 3, 6, 9에 해당하는 것이 있으면 *
        }
    }
}
