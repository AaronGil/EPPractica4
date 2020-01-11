package data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class PatientContrTest {
    @Test
    public void getterPatientContrTest() throws Exception{
        PatientContr correct = new PatientContr(new BigDecimal(50.00));
        PatientContr incorrect1 = new PatientContr(new BigDecimal(10000.00));
        PatientContr incorrect2 = new PatientContr(new BigDecimal(-10.00));

        Assertions.assertEquals(correct.getContr(), new BigDecimal(50.00));
        Assertions.assertThrows(Exception.class, incorrect1::getContr,"Error. Wrong contribution, the value must be between 0.00 and 100.00");
        Assertions.assertThrows(Exception.class, incorrect2::getContr,"Error. Wrong contribution, the value must be between 0.00 and 100.00");

    }
}
