package jump.to.java.chap5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 문제 5번
 * 다음 프로그램의 출력결과를 예측하고 그 이유에 대해서 설명하시오.
 */
public class Quest5 {
    
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size()); // 4 [call by reference]
        a.forEach(System.out::println);
    }
}



