package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcualatorJunitTest1
{
    /* 중복값을 제거 예제 
     * Calculator 인스턴스 변수를 지역변수가 아니라 전역변수로 선언해준 뒤 사용한다*/

    Calculator calculator = new Calculator();
   
    // 아래와 같이 하면 테스트 실패
    // 결과값이 10 != 56
    @Test
    public void add() {
        assertEquals(10, calculator.add(2, 54));
    }
   

}
