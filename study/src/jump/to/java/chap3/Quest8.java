package jump.to.java.chap3;

import java.util.HashMap;

public class Quest8 {
    /**
     * 문제 8번 다음의 맵 grade에서 "B'에 해당되는 값을 추출해 보자. 
     * (추출하고 나면 grade에는 "B"에 해당하는 아이템이 사라져야 한다.) 
     * 
     * 맵의 remove 메서드를 사용해 보자.
     */
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        System.out.println(grade.remove("B"));
        System.out.println(grade);
    }

}
