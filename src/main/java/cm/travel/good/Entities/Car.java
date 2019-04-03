package cm.travel.good.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class Car implements Serializable{

    @Id
    @GeneratedValue
    private Long carId;
    private String marque;
    private String coleur;
    private int nombrePlace;
    private  String immatriculation;

    public Car(String marque, String coleur, int nombrePlace, String immatriculation) {
        this.marque = marque;
        this.coleur = coleur;
        this.nombrePlace = nombrePlace;
        this.immatriculation = immatriculation;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getColeur() {
        return coleur;
    }

    public void setColeur(String coleur) {
        this.coleur = coleur;
    }

    public int getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
}
