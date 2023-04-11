package jump.to.java.chap6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 문제 4번
 * 사용자의 입력을 파일(sample.txt)에 저장하는 프로그램을 작성해 보자. 
 * 
 * (단 프로그램을 다시 실행하더라도 기존에 작성한 내용을 유지하고 새로 입력한 내용을 추가해야 한다.)
 */
public class Quest4 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("C:/Users/bestt/WorkSpace/eclipse1/study/chapter6-4.txt", true);
        fw.write("\n" + sc.nextLine());
        sc.close();
        fw.close();
        
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/bestt/WorkSpace/eclipse1/study/chapter6-4.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
        br.close();               
    }
}

