package jump.to.java.chap5;

/**
 * 문제 6번
 * 다음은 Calculator 객체를 생성하고 값을 더한 후에 그 결과값을 출력하는 예제이다.
 * 하지만 코드를 실행하면 오류가 발생한다. 이 코드의 오류를 수정하시오.
 */
class Calculator2 {
    // Integer value;
    Integer value = 0; // A :: 생성시 값을 초기화해주거나, 미리 초기화 해두면 된다
    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class Quest6 {
    
    public static void main(String[] args) {
        Calculator2 cal = new Calculator2();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }
    
}