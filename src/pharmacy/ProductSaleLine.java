package pharmacy;


import data.PatientContr;


import data.ProductID;
import java.math.BigDecimal;


public class ProductSaleLine{

    private ProductID productID;
    private BigDecimal subtotal;


    public ProductSaleLine(ProductID prodID, BigDecimal sub){
        this.productID=prodID;
        this.subtotal=sub;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        ProductSaleLine prodSaleLine = (ProductSaleLine) o;
        return productID.equals(prodSaleLine.productID) && subtotal.equals(prodSaleLine.subtotal);
    }
    public BigDecimal getSubtotal(){
        return this.subtotal;
    }



}
