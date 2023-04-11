package jump.to.java.chap3;

public class Quest2 {
    /**
     * 문제 3번 
     * 홍길동 씨의 주민등록번호는 881120-1068234이다. 
     * 주민등록번호 뒷자리의 맨 첫 번째 숫자는 성별을 나타낸다. 
     * 주민등록번호에서 성별을 나타내는 숫자를 출력해 보자.
     * 
     * 문자열 인덱싱을 사용해 보자.
     */
    public static void main(String[] args) {
        final String RRN = "881120-1068234";
        if (RRN.charAt(7) == '1') {
            System.out.println("성별 : " + "남성");
        } else {
            System.out.println("성별 : " + "여성");
        }
    }
}