package jump.to.java.free;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test{
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>() ;
        strList.add("하나");
        strList.add("둘");
        strList.add("삼");
        strList.add("넷");
        strList.add("오");
        strList.add("여섯");
        strList.add("칠");
        strList.add("팔");
        strList.add("아홉");
        strList.stream().forEach(System.out::print);        
        System.out.println();
        
        Stream<String> str = strList.stream().sorted();
        strList = str.collect(Collectors.toList());
        strList.stream().forEach(System.out::print);
        System.out.println();
        
        List li = new ArrayList(); // 엥 이게된다고?
        li.add("1");
        li.add(1);
        li.add(1.1);
        
        li.stream().forEach(System.out::println);
    }
}
