package cm.travel.good.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class Departure implements Serializable {

    @Id
    @GeneratedValue
    private Long departId;
    private String lieuDepart;
    private String lieuArrive;
    private Date dateDepart;


    public Departure(String lieuDepart, String lieuArrive, Date dateDepart) {
        this.lieuDepart = lieuDepart;
        this.lieuArrive = lieuArrive;
        this.dateDepart = dateDepart;
    }

    public Long getDepartId() {
        return departId;
    }

    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public void setLieuDepart(String lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    public String getLieuArrive() {
        return lieuArrive;
    }

    public void setLieuArrive(String lieuArrive) {
        this.lieuArrive = lieuArrive;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }
}
