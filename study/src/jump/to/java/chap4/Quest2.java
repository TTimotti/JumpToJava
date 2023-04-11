package jump.to.java.chap4;

public class Quest2 {

    /**
     * 문제 2번 
     * while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
     */
    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        while (i <= 1000) {
            if (i % 3 == 0) {
                result += i;
            }
            i++;
        }
        System.out.println(result);
    }
}
