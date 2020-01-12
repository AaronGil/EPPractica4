//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pharmacy;

import data.ProductID;
import pharmacy.Exceptions.DispensingNotAvailableException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispensingTest {
    Dispensing dispensation;
    MedicineDispensingLine medicinePrescription;
    MedicineDispensingLine medicinePrescription2;


    public DispensingTest() {
    }

    @BeforeEach
    public void setUp()  {
        this.medicinePrescription = new MedicineDispensingLine(new ProductID("1010101010"));
        this.medicinePrescription2 = new MedicineDispensingLine(new ProductID("1234567890"));
        List<MedicineDispensingLine> prescription = new ArrayList();
        prescription.add(this.medicinePrescription);
        prescription.add(this.medicinePrescription2);
        this.dispensation = new Dispensing();
    }

    @Test
    public void dispensingEnabledTest() throws DispensingNotAvailableException {
        Assertions.assertTrue(this.dispensation.dispensingEnabled());
    }

    @Test
    public void setProductAsDispensedTest()  {
        this.dispensation.setProductAsDispensed(new ProductID("1010101010"));
        Assertions.assertTrue(this.medicinePrescription.getAdquired());
    }

    @Test
    public void setCompletedTest() {
        this.dispensation.setCompleted();
        Assertions.assertTrue(this.medicinePrescription.getAdquired());
        Assertions.assertTrue(this.medicinePrescription2.getAdquired());
    }
}
