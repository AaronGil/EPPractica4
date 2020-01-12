//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pharmacy;

import data.ProductID;
import pharmacy.Exceptions.DispensingNotAvailableException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispensingTest {
    private Dispensing dispensation;
    MedicineDispensingLine medicinePrescription;
    MedicineDispensingLine medicinePrescription2;


    public DispensingTest() {
    }

    @BeforeEach
    public void setUp()  {

        this.medicinePrescription = new MedicineDispensingLine(new ProductID("101010101010"));
        this.medicinePrescription2 = new MedicineDispensingLine(new ProductID("123456789012"));
        List<MedicineDispensingLine> prescription = new ArrayList();
        prescription.add(this.medicinePrescription);
        prescription.add(this.medicinePrescription2);


        ProductID productID = new ProductID("123456789012");
        MedicineDispensingLine line = new MedicineDispensingLine(productID);
       //dispensation.addLine(line);

        Byte nOrder = new Byte("5");
        Date initDate = new Date();
        Date finalDate = new Date();
        this.dispensation = new Dispensing(nOrder, initDate,finalDate);
    }

    @Test
    public void dispensingEnabledTest() throws DispensingNotAvailableException {
        Assertions.assertTrue(this.dispensation.dispensingEnabled());
    }
/*
    @Test
    public void setProductAsDispensedTest()  {
        this.dispensation.setProductAsDispensed(new ProductID("1010101010"));
        Assertions.assertTrue(this.medicinePrescription.getAdquired());
    }

 */

    @Test
    public void setCompletedTest() {
        this.dispensation.setCompleted();
        Assertions.assertTrue(this.dispensation.getIsCompleted());
        Assertions.assertTrue(this.dispensation.getIsCompleted());
    }
}
