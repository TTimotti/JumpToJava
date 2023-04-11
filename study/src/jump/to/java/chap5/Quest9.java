package jump.to.java.chap5;

/**
 * 문제 9번
 * 다음의 코드를 보고 1번, 2번, 3번, 4번, 5번, 6번 문장 중에서 오류가 발생하는 문장을 모두 찾고 오류의 원인에 대해서 설명하시오.
 */
interface Predator2 {
    String bark();
}

abstract class Animal2 {
    public String hello() {
        return "hello";
    }
}

class Dog2 extends Animal2 {
}

class Lion2 extends Animal2 implements Predator2 {
    public String bark() {
        return "Bark bark!!";
    }
}

public class Quest9 {
    
    public static void main(String[] args) {
        Animal2 a = new Lion2();
        Lion2 b = new Lion2();
        Predator2 c = new Lion2();

//        System.out.println(a.hello());  // 1번
//        System.out.println(a.bark());   // 2번 a는 Animal2 임. Animal2 은 bark() 메서드가 없음.
//        System.out.println(b.hello());  // 3번
//        System.out.println(b.bark());   // 4번
//        System.out.println(c.hello());  // 5번 c는 Predatro2를 구현한 사자임 Predatro2를 구현한 사자는 hello() 메서드가 없음 
//        System.out.println(c.bark());   // 6번
    }
}
