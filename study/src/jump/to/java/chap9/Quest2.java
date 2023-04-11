package jump.to.java.chap9;

import java.util.HashMap;

public class Quest2 {

	/**
	 * 문제 2번
	 * a 맵에는 'C'라는 key가 없으므로 아래처럼 null이 출력된다. 'C'에 해당하는 key 값이 없을 경우 null 대신 70을 얻을 수 있도록 수정하시오.
	 *
	public static void main(String[] args)  {
	    HashMap<String, Integer> a = new HashMap<>();
	    a.put("A", 90);
	    a.put("B", 80);
	    System.out.println(a.get("C"));  // null 출력
	}
	 */
	public static void main(String[] args)  {
	    HashMap<String, Integer> a = new HashMap<>();
	    a.put("A", 90);
	    a.put("B", 80);	  
	   	System.out.println(a.getOrDefault("C", 70));	  
	}	
}
