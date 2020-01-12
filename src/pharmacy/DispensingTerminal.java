package pharmacy;


import data.HealthCardID;
import data.PatientContr;
import data.ProductID;
import pharmacy.Exceptions.DispensingNotAvailableException;
import pharmacy.Exceptions.SaleClosedException;
import pharmacy.Exceptions.ProductIDException;
import pharmacy.Exceptions.SaleNotInitiatedException;
import services.HealthCardReader;
import services.NationalHealthService;


import java.math.BigDecimal;
import java.net.ConnectException;

public class DispensingTerminal {
    public Dispensing currentDispensing;
    public Sale sale;
    public HealthCardReader hCR;
    public NationalHealthService SNS;
    public HealthCardID hCID;

    public Dispensing getCurrentDispensing(){
        return this.currentDispensing;
    }

    public Sale getSale(){
        return this.sale;
    }

    public void setHCR (HealthCardReader hCR){
        this.hCR = hCR;
    }

    public void setSNS(NationalHealthService SNS){
        this.SNS = SNS;
    }
    public HealthCardID gethCID(){
        return this.hCID;
    }

    public void initNewSale() throws DispensingNotAvailableException {
        if(currentDispensing.dispensingEnabled()){
            sale = new Sale();
        }
    }
    public void enterProduct(ProductID pID) throws ProductIDException, ConnectException, SaleClosedException {
        ProductSpecification product = new ProductSpecification(pID);
        ProductSaleLine lineaVenta = new ProductSaleLine(pID,product.getPrice());
        PatientContr patientContr = SNS.getPatientContr(hCID);
        sale.addLine(pID, product.getPrice(), patientContr);
        currentDispensing.setProductAsDispensed(pID);
    }
    public void finalizeSale() throws SaleNotInitiatedException, SaleClosedException {
        currentDispensing.setCompleted();
        sale.calculateFinalAmount();
    }

    public void realizePayment(BigDecimal quantity) {}
    public void printNextDispensingSheet() {}

}

