package data;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class ProductIDTest {

    @Test
    public void getterProductID() throws Exception{
        ProductID correct = new ProductID("123456789012");
        ProductID incorrect1 = new ProductID("12345678901234567890");
        ProductID incorrect2 = new ProductID("ABCDEFGHIJKL");
        ProductID incorrect3 = new ProductID("");

        Assertions.assertEquals(correct.getProductID(), "123456789012");
        Assertions.assertTrue(correct.checkCode());
        Assertions.assertFalse(incorrect1.checkCode());
        Assertions.assertFalse(incorrect2.checkCode());
        Assertions.assertFalse(incorrect3.checkCode());
    }
}
