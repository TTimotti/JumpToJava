package jump.to.java.chap5;

/**
 * 문제 7번
 * 다음은 광물의 가치를 계산하는 MineralCalculator 클래스와 그 사용법이 담긴 코드이다.
 * 광물 계산기는 금인 경우 100, 은인 경우 90, 구리의 경우는 80의 가치를 더하는 기능(add 메서드)이 있다.
 * 
 * 하지만 이 광물 계산기는 광물이 추가될 때마다 add 메서드를 추가해야 한다는 단점이 있다. 
 * 광물이 추가되더라도 MineralCalculator 클래스를 변경할 필요가 없도록 코드를 수정하시오.
 * 
 * Mineral 인터페이스를 생성하고 광물 클래스에 적용해 보자.
 */
interface Mineral {
    int getPrice();
}

class Gold implements Mineral {

    @Override
    public int getPrice() {
        
        return 100;        
    }
}

class Silver implements Mineral {

    @Override
    public int getPrice() {
        
        return 90;        
    }
}

class Bronze implements Mineral {

    @Override
    public int getPrice() {
        
        return 80;        
    }
}

class MineralCalculator  {
    
    int value = 0;
    
    void add(Mineral mine) {        
        value += mine.getPrice();
    }

    public int getValue() {
        return this.value;
    }

}

public class Quest7 {
    
    public static void main(String[] args) {
        
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
        
    }
    
}