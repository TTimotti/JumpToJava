package jump.to.java.chap5;

/**
 * 문제 8번
 * 다음의 코드를 보고 1번, 2번, 3번, 4번, 5번 문장 중에서 오류가 발생하는 문장을 모두 찾고 오류의 원인에 대해서 설명하시오.
 */
interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
}

//public class Sample {
//    public static void main(String[] args) {
//        Animal a = new Animal();  // 1번 
//        Animal b = new Dog();  // 2번
//        Animal c = new Lion();  // 3번
//        Dog d = new Animal();  // 4번 => 오류발생 Animal은 Dog에 속하지 않음
//        Predator e = new Lion();  // 5번
//    }
//}
public class Quest8 {
    public static void main(String[] args) {
    }
}