package jump.to.java.chap3;

import java.util.HashMap;

public class Quest10 {

    /**
     * 문제 10번
     * 다음은 커피의 종류(1: 아메리카노, 2:아이스 아메리카노, 3:카페라떼)를 입력하면 커피의 가격을 알려주는 프로그램이다.
     * 위 코드에서 1, 2, 3과 같은 매직넘버를 제거하여 프로그램을 개선해보자.
     * 
     * public class Sample { 
     *     enum CoffeeType { 
     *         AMERICANO, 
     *         ICE_AMERICANO, 
     *         CAFE_LATTE
     * };
     * 
     *     public static void main(String[] args) {     * 
     *         for(CoffeeType type: CoffeeType.values()) { 
     *             System.out.println(type); // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력 
     *         } 
     *     } 
     * }
     * 
     * Enum을 사용해 보자.
     */
    public static void main(String[] args) {
        printCoffeePrice(CoffeeMenu.AMERICANO); // "가격은 3000원 입니다." 출력
        printCoffeePrice(CoffeeMenu.ICE_AMERICANO); // "가격은 4000원 입니다." 출력
    }

    static void printCoffeePrice(CoffeeMenu type) {
        HashMap<CoffeeMenu, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeMenu.AMERICANO, 3000); // 1: 아메리카노
        priceMap.put(CoffeeMenu.ICE_AMERICANO, 4000); // 2: 아이스 아메리카노
        priceMap.put(CoffeeMenu.CAFE_LATTE, 5000); // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    enum CoffeeMenu {
        AMERICANO, ICE_AMERICANO, CAFE_LATTE
    }
}
