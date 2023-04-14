package jump.to.java.chap9;

public class Quest4 {

	/**
	 * 문제 4번
	 * 
	 * 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후에 이어지는 항은 이전의 두 항을 더한 값으로 이루어지는 수열을 피보나치 수열이라고 한다.
	 * 
	 * 0, 1, 1, 2, 3, 5, 8, 13, ...
	 * 입력을 정수 n으로 받았을 때, n항 이하까지의 피보나치 수열을 출력하는 프로그램을 작성해 보자.
	 */
	public static void main(String[] args)  {
	    System.out.println(fib(21)); // 0 1 1 2 3 5 8 13...
	}
	
	static int fib(int n) {
	    
        if (n <= 0) return 0;
        
        else if (n == 1) return 1;
        
        else {  // n이 2 이상일 때는 그 이전의 두 값을 더하여 반환
            return fib(n - 2) + fib(n - 1);
        }
    }
}
