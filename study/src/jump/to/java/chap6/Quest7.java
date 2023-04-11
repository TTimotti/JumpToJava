package jump.to.java.chap6;

/**
 * 문제 2번
 * 두 개의 숫자를 입력받아 그 합을 출력하는 프로그램을 작성하시오.
 */
public class Quest7 {
    
    public static void main(String[] args) {
        int total = 240;
        int cntPerTen = 25;
        int insurance = 11;
        int offering = 5;
        int mobile = 8;
        int transportation = 5;
        int houseSub = 10;
        int saving = 34;
        int isa = 50; // max 50
        int loan = 15;
        int food = 30;
        int fixedCost = cntPerTen + insurance + offering + mobile + transportation + food; // 84
        int savingCost = houseSub + saving + isa + loan; // 109
        
        // total - (fixedCost + savingCost) == 47       
    }
}

