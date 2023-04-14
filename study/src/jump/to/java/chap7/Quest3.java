package jump.to.java.chap7;

import java.util.ArrayList;
import java.util.List;

/*
 * 문제 3번
 * 
 * 스레드를 사용하여 work 메서드를 동시에 수행하면 시간을 단축할 수 있을 것이다. 위 코드에 스레드를 적용하여 시간을 단축해 보자.
*/
class HeavyWork extends Thread {
    
    String name;

    HeavyWork(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        work();    
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100); // 0.1 초 대기한다.
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }
}


public class Quest3 { // 이게 최선인가..? 더 좋은 코드가 있지 않을까.>?????? for문 두번돌리는게 최선인가..????
    
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Thread> threads = new ArrayList<>();
        
        for (int i = 1; i < 5; i++) {            
            Thread thread = new HeavyWork("w" + i);
            thread.start();
            threads.add(thread);
        }
        
        try {
            for (Thread thread : threads) {
                thread.join();
            }            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }

}


