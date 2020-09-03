package thisone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalc{

    @Test
    public void testAdd() {
  
        assertEquals(4, Calc.Add(2, 2));

    }
}