package jump.to.java.chap7;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 문제 4번
 * 
 * 코드를 함수형 프로그래밍을 사용하여 표현해 보자. 
 */
class Quest4 {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> temp = new ArrayList<>();
        
        Arrays.stream(numbers).filter(x -> x % 2 == 1).forEach(x -> temp.add(x * 2));
        temp.forEach(System.out::println);
        
        // 정수 리스트를 정수배열로 변환한다.
        int[] result = temp.stream().mapToInt(i->i).toArray();
        Arrays.stream(result).forEach(System.out::println);
        
    }
    
}