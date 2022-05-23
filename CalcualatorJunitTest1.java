package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcualatorJunitTest1
{
//    /* �ߺ����� ���� ���� 
//     * Calculator �ν��Ͻ� ������ ���������� �ƴ϶� ���������� �������� �� ����Ѵ�*/
//
//    Calculator calculator = new Calculator();
//   
//    // �Ʒ��� ���� �ϸ� �׽�Ʈ ����
//    // ������� 10 != 56
//    @Test
//    public void add() {
//        assertEquals(10, calculator.add(2, 54));
//    }
//   
    
    
    /* junit �� sysout�� �ٸ���  ������� ���� �ƴ� ���α׷��� ���� �ڵ�ȭ �Ѵ�. 
     * ������ JUnit�� �׽�Ʈ�� �����ϱ� ���� �ʱ�ȭ �۾��� ���� ���� �������� ����
     * @Before ������̼��� ����Ѵ�. -> ���� : JUnit5 ���ʹ� @BeforeEach ������̼��� ����Ѵ�.
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
        System.out.println("������ �帥��....��");
        
    }
    
    

}
