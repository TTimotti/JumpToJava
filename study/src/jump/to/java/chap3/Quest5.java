package jump.to.java.chap3;

public class Quest5 {

    /**
     * 문제 5번
     * 
     * a:b:c:d 
     * 문자열의 split와 join 메서드를 사용하여 위 문자열을 다음과 같이 고치시오
     * 
     * => a#b#c#d
     */
    public static void main(String[] args) {

        String str = "a:b:c:d";
        String[] list = str.split(":");

        System.out.println(String.join("#", list));
    }

}
