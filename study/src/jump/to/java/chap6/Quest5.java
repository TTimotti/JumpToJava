package jump.to.java.chap6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 문제 5번
 * 다음과 같은 내용을 지닌 파일 sample.txt 파일이 있다. 
 * 이 파일의 내용 중 "python" 이라는 문자열을 "java"로 바꾸어서 저장해 보자.
 * 
 * Life is too short
 * you need python
 * 
 * replaceAll 함수를 사용해 보자.
 */
public class Quest5 {
    
    public static void main(String[] args) throws IOException {        
        List<String> text = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/bestt/WorkSpace/eclipse1/study/chapter6-5.txt"));        
        while (true) {
            String line = br.readLine();                        
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            text.add(line);              
        }
        br.close();
        text.forEach(System.out::println);
        
        FileWriter fw = new FileWriter("C:/Users/bestt/WorkSpace/eclipse1/study/chapter6-5.txt");
        for (String t : text) {
            fw.write(t.replaceAll("python", "Java") + "\n");
        }
        fw.close();   
        
    }
}

