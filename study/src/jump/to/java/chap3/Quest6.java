package jump.to.java.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Quest6 {
    /**
     * 문제 6번 
     * 다음과 같은 [1, 3, 5, 4, 2] 리스트를 [5, 4, 3, 2, 1]로 만들어 보자.
     */
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        System.out.println(myList); // [1, 3, 5, 4, 2] 출력

        myList.sort(Comparator.reverseOrder());
        System.out.println(myList); // [5, 4, 3, 2, 1] 출력
    }

}
