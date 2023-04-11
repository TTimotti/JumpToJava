package jump.to.java.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Quest9 {
    /**
     * 문제 9번 
     * 다음의 numbers 리스트에서 중복 숫자를 제거해 보자.
     * 
     * 집합 자료형의 요솟값이 중복될 수 없다는 특징을 사용해 보자.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers); // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력

        Set<Integer> numbers2 = new HashSet<>(numbers);
        System.out.println(numbers2);
    }

}
