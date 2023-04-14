package jump.to.java.chap7;

import java.util.Arrays;

/*
 * 문제 5번
 * 
 * 함수형 프로그래밍을 사용하여 다음의 정수 배열에서 음수를 모두 제거해 보자.
 * 즉, 프로그램 실행 후 다음과 같은 정수 배열을 얻어야 한다.
 * int[] result = {1, 3, 8};
 */
class Quest5 {
    
    public static void main(String[] args) {
        
        int[] numbers = {1, -2, 3, -5, 8, -3};
        int[] result = Arrays.stream(numbers).filter(x-> x>=0).toArray();
        
        Arrays.stream(result).forEach(System.out::println);
    }
    
}