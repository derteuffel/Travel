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
public class Buy implements Serializable {

    @Id
    @GeneratedValue
    private Long achatId;
    private Double montant;
    private Date dateDepart;
    private String userName;

    public Buy(Double montant, Date dateDepart, String userName) {
        this.montant = montant;
        this.dateDepart = dateDepart;
        this.userName = userName;
    }

    public Long getAchatId() {
        return achatId;
    }

    public void setAchatId(Long achatId) {
        this.achatId = achatId;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
