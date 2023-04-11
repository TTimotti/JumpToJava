package jump.to.java.chap3;

public class Quest1 {

    /**
     * 문제 1번 
     * 홍길동 씨의 과목별 점수는 다음과 같다. 홍길동 씨의 평균 점수를 구해 보자.
     */
    public static void main(String[] args) {
        int korea = 80;
        int english = 75;
        int math = 55;

        int sum = korea + english + math;
        double result = sum / 3;

        System.out.printf("평균 점수 : %.2f점", result);
    }

}
