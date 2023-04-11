package jump.to.java.chap4;

public class Quest1 {

    /**
     * 문제 1번 
     * 다음 코드의 출력 결과는 무엇일까? (눈으로 해석하고 풀어보자.)
     */
    public static void main(String[] args) {
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
    }
}
