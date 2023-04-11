package jump.to.java.chap5;

/**
 * 문제 3번
 * 다음과 같이 주어진 정수가 홀수인지 짝수인지 판별해 주는 Calculator 클래스를 작성하시오.
 * (홀수이면 true, 짝수면 false를 리턴해야 한다.)
 * 
 * Calculator cal = new Calculator();
 * System.out.println(cal.isOdd(3));  // 3은 홀수이므로 true 출력
 * System.out.println(cal.isOdd(4));  // 4는 짝수이므로 false 출력
 */
public class Quest3 {
    
    public static void main(String[] args) {
        OddCalculator cal = new OddCalculator();
        System.out.println(cal.isOdd(3));  // 3은 홀수이므로 true 출력
        System.out.println(cal.isOdd(4));  // 4는 짝수이므로 false 출력
    }
}

class OddCalculator extends Calculator {
    boolean isOdd(int num) {
        return num % 2 != 0;
    }
}


