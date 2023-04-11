package jump.to.java.chap4;

public class Quest5 {

    /**
     * 문제 5번
     * A 학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다.
     * int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
     * for each 문을 사용하여 A 학급의 평균 점수를 구해 보자.
     */
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;
        for (int i : marks) {
            sum += i;
        }
        double result = sum / marks.length;
        System.out.printf("A학급의 평균 점수 : %.2f점", result);
    } // end of main
} // end of class
