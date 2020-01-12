package pharmacy;


import data.ProductID;
import pharmacy.Exceptions.DispensingNotAvailableException;
import pharmacy.Exceptions.SaleClosedException;
import pharmacy.Exceptions.ProductIDException;
import pharmacy.Exceptions.SaleNotInitiatedException;



import java.math.BigDecimal;
import java.net.ConnectException;

public class DispensingTerminal {
    public Dispensing dipensacioEnCurs = new Dispensing();
    public Sale sale;

    public void initNewSale() throws DispensingNotAvailableException {
        sale = new Sale();
    }
    public void enterProduct(ProductID pID) throws ProductIDException, ConnectException {
        ProductSpecification product = new ProductSpecification(pID);
        ProductSaleLine lineaVenta = new ProductSaleLine(pID,product.getPrice());
        dipensacioEnCurs.setProductAsDispensed(pID);
    }
    public void finalizeSale() throws SaleNotInitiatedException, SaleClosedException {
        dipensacioEnCurs.setCompleted();
        sale.calculateFinalAmount();
    }
    public void realizePayment(BigDecimal quantity) {}
    public void realizePayment() {}
    public void printNextDispensingSheet() {}

}

