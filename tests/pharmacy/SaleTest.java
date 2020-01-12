package pharmacy;

import data.PatientContr;
import data.ProductID;
import pharmacy.Exceptions.SaleClosedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SaleTest {

    private Sale sale;
    private PatientContr contr;
    private ProductID productID;
    private static BigDecimal IVA = new BigDecimal(1.21);

    @BeforeEach
    void setup()  {
        contr = new PatientContr(new BigDecimal(0.5));
        productID = new ProductID("1234567890");
        sale = new Sale();
    }

    @Test
    void setClosed() {
        sale.setClosed();
        assertEquals(sale.isClosed(),true);
    }

    @Test
    void isClosed() {
        sale.setClosed();
        assertTrue(sale.isClosed());
    }
}