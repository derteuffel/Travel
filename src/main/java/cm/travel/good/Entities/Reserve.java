package cm.travel.good.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class Reserve implements Serializable {

    @Id
    @GeneratedValue
    private Long reserveId;
    private Double prix;
    private String periode;
    private Date dateReservation;
    private Boolean statut;


    public Reserve(Double prix, String periode, Date dateReservation, Boolean statut) {
        this.prix = prix;
        this.periode = periode;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public Long getReserveId() {
        return reserveId;
    }

    public void setReserveId(Long reserveId) {
        this.reserveId = reserveId;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }
}
