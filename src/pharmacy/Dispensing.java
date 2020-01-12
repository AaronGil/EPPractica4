package pharmacy;

import data.ProductID;
import pharmacy.Exceptions.DispensingNotAvailableException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dispensing {
    /*
     * A class that represents the period for dispensing a certain set of medicines, its state and the set of medicines
     */
    private byte nOrder; // n. of order for this dispensing inside the treatment
    private Date initDate, finalDate; //The period
    private boolean isCompleted;
    private List<MedicineDispensingLine> Listofmedicine;//The set of medicines to dispense and its control, among others

    public Dispensing(){
        Listofmedicine = new ArrayList<>();
        isCompleted = false;
    } //Make some initialization

    public boolean dispensingEnabled()  throws DispensingNotAvailableException{
        Date actualDate = new Date();
        if(actualDate.after(this.initDate)) {
            return true;
        }else{
            throw new DispensingNotAvailableException("Disabled");
        }
    }


    public void setProductAsDispensed(ProductID prodID){
        for (MedicineDispensingLine medicineLine : Listofmedicine){
            if(medicineLine.getMedicineId().equals(prodID)){
                medicineLine.setAcquired(prodID);
            }
        }
    }
    public MedicineDispensingLine getLine(ProductID productID){
        for(MedicineDispensingLine line : Listofmedicine){
            if(line.getMedicineId().equals(productID)){
                return line;
            }
        }
        return null;
    }

    public void setCompleted(){
        isCompleted=true;
    }

    public boolean getIsCompleted(){
        return isCompleted;
    }



    public void setnOrder(byte x){
        this.nOrder=x;
    }

    public byte getnOrder(){
        return this.nOrder;
    }

    public List<MedicineDispensingLine> getMedicineDispensingList(){
        return this.Listofmedicine;
    }

    public void addLine(MedicineDispensingLine line){
        this.Listofmedicine.add(line);
    }


    public void setFinalDate(Date date) {
        this.finalDate = date;
    }

    public Date getFinalDate(){
        return this.finalDate;
    }
    public void setInitDate(Date date){
        this.initDate=date;
    }

    public Date getInitDate(){
        return this.initDate;
    }

}
