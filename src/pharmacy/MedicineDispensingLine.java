package pharmacy;

import data.ProductID;

public class MedicineDispensingLine {
    private boolean acquired;
    private ProductID medicine;

    public MedicineDispensingLine (ProductID medicine){
        this.medicine = medicine;
        this.acquired = false;
    }

    public void setAcquired(ProductID medicine) {
        this.acquired = true;
    }
    public ProductID getMedicineId(){
        return this.medicine;
    }
    public boolean isAcquired(){
        return this.acquired;
    }
}
