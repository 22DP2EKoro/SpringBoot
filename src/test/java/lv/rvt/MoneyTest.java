package lv.rvt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {

    @Test
    public void testPlusMethod(){

        Money macins1 = new Money(10, 0);
        Money macins2 = new Money(5, 0);
        Money macins3 = macins1.plus(macins2);

        assertEquals(15, macins3.euros());
        assertEquals(0, macins3.cents());

    }
    @Test
    public void testLessThan(){
        Money macins1 = new Money(54,0);
        Money macins2 = new Money(48, 0);
        Money macins3 = new Money(3, 0);

        boolean result1 = macins1.LessThan(macins2);
        boolean result2 = macins3.LessThan(macins1);

        assertFalse(result1);
        assertTrue(result2);

    }
    @Test
    public void testMinusMethod(){

    
        Money macins1 = new Money(54,0);
        Money macins2 = new Money(48, 0);
        Money macins3 = macins1.Minus(macins2);

        assertEquals(6, macins3.euros());
        assertEquals(0, macins3.cents());

    }



    
    

}
