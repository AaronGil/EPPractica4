package pharmacy;
import data.ProductID;

import pharmacy.ProductSaleLine;
import pharmacy.Exceptions.ProductIDException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ProductSaleLineTest {
    private ProductSaleLine LineaVenda;

    @BeforeEach
    public void setUp() throws ProductIDException {
        ProductID prodID = new ProductID("098765432121");
        BigDecimal subt = BigDecimal.valueOf(7);
        LineaVenda = new ProductSaleLine(prodID, subt);
    }
    @Test
    public void testEquals() throws ProductIDException {
        ProductID productID = new ProductID("098765432121");
        BigDecimal subtotal = BigDecimal.valueOf(7);
        ProductSaleLine expectedSaleLine = new ProductSaleLine(productID, subtotal);
        assertEquals(expectedSaleLine, LineaVenda);
    }

    @Test
    public void testGetter() {
        BigDecimal expectedSub = BigDecimal.valueOf(7);
        assertEquals(expectedSub, LineaVenda.getSubtotal());
    }


}
