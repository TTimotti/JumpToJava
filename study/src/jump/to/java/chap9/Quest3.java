package jump.to.java.chap9;

import java.util.Arrays;

public class Quest3 {

	/**
	 * 문제 3번
	 * 
	 * 다음은 A학급 학생의 점수를 나타내는 정수 배열이다. 다음 배열에서 50점 이상 점수의 총합을 구하시오.
	 * int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
	 */
	public static void main(String[] args)  {
	    int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
	    
	    int sum = Arrays.stream(A).filter(x -> x >= 50).sum();
	    System.out.println(sum);
	}	
}
