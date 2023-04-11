package jump.to.java.chap3;

import java.util.ArrayList;
import java.util.Arrays;

public class Quest7 {
    /**
     * 문제 7번 
     * 다음과 같은 ['Life', 'is', 'too', 'short'] 리스트를 
     * "Life is too short" 문자열로 만들어 출력해 보자.
     * 
     * 문자열의 join 메서드를 사용해 보자.
     */
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList); // [Life, is, too, short] 출력

        System.out.println(String.join(" ", myList));
    }
}
