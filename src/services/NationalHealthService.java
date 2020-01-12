package services;

import data.HealthCardID;
import data.PatientContr;
import data.ProductID;
import pharmacy.Dispensing;
import pharmacy.Exceptions.ProductIDException;
import pharmacy.ProductSpecification;
import services.Exceptions.HealthCardException;
import services.Exceptions.NotValidePrescriptionException;

import java.net.ConnectException;
import java.util.List;

public interface NationalHealthService {
    Dispensing getePrescription(HealthCardID hcID) throws HealthCardException, NotValidePrescriptionException, ConnectException;
    PatientContr getPatientContr(HealthCardID hcID) throws ConnectException;
    ProductSpecification getProductSpecific(ProductID pID) throws ProductIDException, ConnectException;
    List<Dispensing> updateePrescription(HealthCardID hcID, Dispensing disp) throws ConnectException;

}

