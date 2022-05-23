package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorJunitTest
{
    @Test
    public void add() {
      Calculator cal = new Calculator();
      System.out.println(cal.add(3, 1));
    }
    
    @Test
    public void substract() {
        Calculator calculator = new Calculator();
       System.out.println(calculator.substract(10, 5));
    }

    
    // assertEquals를 활용한 테스트 방법
    // 결과값이 다르면 오류, 결과값이 같으면 성공
    @Test
    public void add1() {
        Calculator cal = new Calculator();
        assertEquals(10, cal.add(2, 7));
    }
    
    @Test
    public void substract1() {
        Calculator cal = new Calculator();
        assertEquals(15, cal.substract(30, 15));
    
    }
    
    
    
}
