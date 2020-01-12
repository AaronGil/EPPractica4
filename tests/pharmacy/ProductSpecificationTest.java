package pharmacy;
import pharmacy.ProductSpecification;
import data.ProductID;
import pharmacy.Exceptions.ProductIDException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductSpecificationTest {
    private ProductSpecification productSpecification;

    @BeforeEach
    public void setUp() throws ProductIDException {
        BigDecimal price = BigDecimal.valueOf(6.1);
        String description = "Medicament preventiu del mal de cap";
        ProductID productID = new ProductID("098765432121");
        productSpecification = new ProductSpecification(price, description, productID);
    }


    @Test
    public void testSetterPrice(){
        BigDecimal expectedPrice= BigDecimal.valueOf(2.2);
        productSpecification.setPrice(BigDecimal.valueOf(2.2));
        assertEquals(expectedPrice, productSpecification.getPrice());
    }
    @Test
    public void testGetterDescription(){
        String expectedDescription= "Medicament preventiu del mal de cap";
        assertEquals(expectedDescription, productSpecification.getDescription());
    }

    @Test
    public void testGetterPrice(){
        BigDecimal expectedPrice = BigDecimal.valueOf(6.1);
        assertEquals(expectedPrice, productSpecification.getPrice());
    }


    @Test
    public void testSetterDescription(){
        String expectedDescription = "description";
        productSpecification.setDescription("description");
        assertEquals(expectedDescription, productSpecification.getDescription());
    }


}