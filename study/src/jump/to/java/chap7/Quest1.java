package jump.to.java.chap7;

/*
    다음처럼 house 패키지로 정의된 클래스가 있다. 
    package house;
    
    public class HousePark {
        protected String lastname = "park";
    
        public String getLastname() {
            return this.lastname;
        }
    }
    다음처럼 Sample 클래스에서 HousePark 클래스를 사용하려 한다.
    
    import HousePark;
    
    public class Sample {
        public static void main(String[] args) {
            HousePark housePark = new HousePark();
            System.out.println(housePark.getLastname());
        }
    }
    하지만 위와 같이 작성하면 HousePark 클래스를 찾을 수 없다는 오류가 발생한다. import 문을 수정하여 오류를 해결하시오. 
 */

// import house.HousePark; 로 수정
