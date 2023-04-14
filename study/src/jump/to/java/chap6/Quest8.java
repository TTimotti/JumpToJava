package jump.to.java.chap6;

/**
 * 문제 2번
 * 두 개의 숫자를 입력받아 그 합을 출력하는 프로그램을 작성하시오.
 */
public class Quest8 {
    int a = 1;
    {
        System.out.println("start : " + a);
        a=3;
    }
    
    Quest8() {this.a=5;}
    
    public static void main(String[] args) {
        Quest8 test = new Quest8();
        System.out.println("end : " + test.a);
    }
}

