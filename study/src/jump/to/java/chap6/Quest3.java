package jump.to.java.chap6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 문제 1번
 * 다음은 "sample.txt"라는 파일에 "Write once, run anywhere" 문자열을 저장한 후 다시 그 파일을 읽어서 출력하는 프로그램이다.
 * 
 * 이 프로그램은 우리가 예상한 "Write once, run anywhere"라는 문장을 출력하지 않고 null을 출력한다.
 * 우리가 예상한 값을 출력할 수 있도록 프로그램을 수정해 보자.
 */
//public class Sample {
//    
//    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("sample.txt");
//        fw.write("Write once, run anywhere");
//
//        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
//        String line = br.readLine();
//        System.out.println(line);  // null 이 출력된다.
//    }
//}
public class Quest3 {
    
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\bestt\\WorkSpace\\eclipse1\\study\\sample.txt");
        fw.write("Write once, run anywhere");
        fw.close(); // 입력 스트림 닫기

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\bestt\\WorkSpace\\eclipse1\\study\\sample.txt"));        
        String line = br.readLine();        
        System.out.println(line);
        br.close(); // 출력 스트림 닫기
    }
}

