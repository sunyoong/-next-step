package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcualatorJunitTest1
{
    /* �ߺ����� ���� ���� 
     * Calculator �ν��Ͻ� ������ ���������� �ƴ϶� ���������� �������� �� ����Ѵ�*/

    Calculator calculator = new Calculator();
   
    // �Ʒ��� ���� �ϸ� �׽�Ʈ ����
    // ������� 10 != 56
    @Test
    public void add() {
        assertEquals(10, calculator.add(2, 54));
    }
   

}
