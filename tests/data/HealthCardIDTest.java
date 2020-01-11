package data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HealthCardIDTest {

    @Test
    public void getterTest() throws Exception {
        HealthCardID correct = new HealthCardID("AAAA1234567890");
        HealthCardID incorrect1 = new HealthCardID("AAA1234567890");
        HealthCardID incorrect2 = new HealthCardID("1234567890AAAA");
        HealthCardID incorrect3 = new HealthCardID("");

        Assertions.assertEquals(correct.getPersonalID(), "AAAA1234567890");
        Assertions.assertTrue(correct.checkCode());
        Assertions.assertFalse(incorrect1.checkCode());
        Assertions.assertFalse(incorrect2.checkCode());
        Assertions.assertFalse(incorrect3.checkCode());
    }



}
