package calculator;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import javax.xml.bind.ParseConversionEvent;

import org.omg.CORBA.portable.ValueBase;

public class StringCalculator
{
    
    // return 값이 0 또는 null일 떄 
//    int add(String text) {
//        if(text==null || text.equals(" ")) {
//            return 0;
//        }
//        
//        return 0;
//        
//    }
//    

    
   public int add(String text) {
        if(text==null || text.isEmpty()) {
            return 0;
        }
        
        return Integer.parseInt(text);
        
    }
    
    public int add2(String text) {
        if(text==null | text.isEmpty()) {
            return 0;
        }
        
        if(text.contains(",")) {
            String[] numbers = text.split(",");
            int sum = 0;
            for(String value : numbers) {
                sum += Integer.parseInt(value);
            }
            return sum;
        }
        
        return Integer.parseInt(text);
        
    }
    
    
    
}
