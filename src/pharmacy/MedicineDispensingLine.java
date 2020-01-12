package pharmacy;

import data.ProductID;

public class MedicineDispensingLine {
    private boolean adquired;
    private ProductID medicine;

    public MedicineDispensingLine (ProductID medicine){
        this.medicine = medicine;
        this.adquired = false;
    }

    public void setAdquired() {
        this.adquired = true;
    }
    public ProductID getMedicineId(){
        return this.medicine;
    }
    public boolean isAdquired(){
        return this.adquired;
    }
    public boolean getAdquired(){
        return adquired;
    }
}
