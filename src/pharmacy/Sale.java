package pharmacy;
/*
 *Package for the classes involved in the use case Suply next dispensing
 */
import data.PatientContr;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pharmacy.Exceptions.SaleClosedException;
import data.ProductID;
import java.math.BigDecimal;

public class Sale { //A class that represents the sale of medicines
    private int saleCode;
    private int lastSaleCode=1;
    private Date date;
    private BigDecimal amount;
    private boolean isClosed; //flag to know if the sale is closed
    private List<ProductSaleLine> productsList;
    private List<BigDecimal> prices = new ArrayList();
    private ProductSaleLine NewProdSL;
    private BigDecimal total;


    public Sale(){ //Assigns the current date, a code to the sale, etc.
        this.date= new Date();

        this.productsList=new ArrayList<>();
        this.amount=BigDecimal.valueOf(0);
        this.total=BigDecimal.valueOf(0);
        this.saleCode=lastSaleCode++;
        this.lastSaleCode++;
        this.isClosed=false;
    }

    public void addLine(ProductID prodID, BigDecimal price, PatientContr contr) throws SaleClosedException{
        if(isClosed){
            throw new SaleClosedException("Closed!");
        }
        else{

        }
    }

    private void calculateAmount(){
        for(ProductSaleLine saleLine : productsList){
            amount=amount.add(saleLine.getSubtotal());
        }
    }

    private void addTaxes() throws SaleClosedException{
        if(isClosed){
            throw new SaleClosedException("Closed!");
        }
        BigDecimal IVA = BigDecimal.valueOf(1.21);
        amount=amount.multiply(IVA);
    }



    public void calculateFinalAmount() throws SaleClosedException{
        if(isClosed){
            throw new SaleClosedException("Closed");
        }
        calculateAmount();
        addTaxes();
    }

    public BigDecimal getAmount() throws SaleClosedException {
        calculateFinalAmount();
        return amount;
    }
    public void setClosed() {
        isClosed = true;
    }
    public boolean isClosed() {
        return isClosed;
    }
    public int getSaleCode() {
        return this.saleCode;
    }
    public List<ProductSaleLine> getProductsList(){
        return this.productsList;
    }


}
