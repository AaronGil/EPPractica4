package pharmacy;

import data.ProductID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pharmacy.MedicineDispensingLine;

import static org.junit.jupiter.api.Assertions.*;

public class MedicineDispensingLineTest {
    private MedicineDispensingLine medicineLine;
    private ProductID productID;

    @BeforeEach
    public void setUp()  {
        productID = new ProductID("123456789000");
        medicineLine=new MedicineDispensingLine(productID);

    }

    @Test
    public void setAdquiredTest(){
        medicineLine.setAdquired();
        assertTrue(medicineLine.isAdquired());
    }


    @Test
    public void getMedicineTest() {
        ProductID expectedID = new ProductID("123456789000");
        assertEquals(expectedID, medicineLine.getMedicineId());
    }

    @Test
    public void isAdquiredTest(){
        assertFalse(medicineLine.isAdquired());
        medicineLine.setAdquired();
        assertTrue(medicineLine.isAdquired());
    }

    @Test
    public void equalsTest() {
        MedicineDispensingLine expectedLine = new MedicineDispensingLine(new ProductID("123456789000"));
        assertEquals(expectedLine, medicineLine);
    }
}