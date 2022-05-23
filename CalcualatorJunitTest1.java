package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcualatorJunitTest1
{
//    /* 중복값을 제거 예제 
//     * Calculator 인스턴스 변수를 지역변수가 아니라 전역변수로 선언해준 뒤 사용한다*/
//
//    Calculator calculator = new Calculator();
//   
//    // 아래와 같이 하면 테스트 실패
//    // 결과값이 10 != 56
//    @Test
//    public void add() {
//        assertEquals(10, calculator.add(2, 54));
//    }
//   
    
    
    /* junit 은 sysout과 다르게  결과값을 눈이 아닌 프로그램을 통해 자동화 한다. 
     * 하지만 JUnit은 테스트를 실행하기 위한 초기화 작업을 위와 같이 실행하지 않음
     * @Before 어노테이션을 사용한다. -> 수정 : JUnit5 부터는 @BeforeEach 어노테이션을 사용한다.
     *
     * */
    
    private Calculator cal;
    
    @BeforeEach
    public void setup() {
        cal = new Calculator();
    }
    
    @Test
    public void add() {
        assertEquals(10, cal.add(2, 8));
    }
    
    @Test
    public void substract() {
        assertEquals(5, cal.substract(3, 2));
    }
    
    @AfterEach
    public void teardown() {
        System.out.println("눈물이 흐른다....☆");
        
    }
    
    

}
