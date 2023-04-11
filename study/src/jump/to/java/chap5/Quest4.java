package jump.to.java.chap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제 4번
 * 다음과 같이 정수 배열 또는 정수의 리스트로 그 평균값을 구해 리턴하는 Calculator 클래스를 작성하시오.
 */
public class Quest4 {
    
    public static void main(String[] args) {
        // 정수 배열의 경우
        int[] data = {1, 3, 5, 7, 9};
        AvgCalculator cal = new AvgCalculator();
        int result = cal.avg(data);
        System.out.println(result);  // 5 출력
        
        // 정수 리스트의 경우
        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result2 = cal.avg(data2);
        System.out.println(result2);  // 5 출력
    }
}

class AvgCalculator extends Calculator {
    int avg(int[] data) {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum / data.length;
    }
    
    int avg(List<Integer> data) {
        int sum = 0;
        for (int i : data) {
            sum += i;
        }
        return sum / data.size();
    }
}


