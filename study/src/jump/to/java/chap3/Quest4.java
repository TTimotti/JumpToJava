package jump.to.java.chap3;

public class Quest4 {
    /**
     * 문제 2번 
     * 자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법에 대해 말해 보자.
     */
    public static void main(String[] args) {
        isOdd(13);
    }

    static void isOdd(int num) {
        if (num % 2 == 1) {
            System.out.println(num + "은 홀수 입니다.");
        } else {
            System.out.println(num + "은 짝수 입니다.");
        }
    }
}
