package thisone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc{

    @Test
    public void testAdd() {  
        assertEquals(4, Calc.Add(2, 2));
    }	
	
	    @Test
    public void testSubtract() {  
        assertEquals(1, Calc.Subtract(3, 2));
    }
	
}