package cm.travel.good.Entities;

import javax.persistence.Entity;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class VIP extends Car {
    public VIP(String marque, String coleur, int nombrePlace, String immatriculation) {
        super(marque, coleur, nombrePlace, immatriculation);
    }
}
