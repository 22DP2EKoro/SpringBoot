package lv.rvt;

import static org.junit.Assert.assertEquals;
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
    

}
