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
public class Ticket implements Serializable{

    @Id
    @GeneratedValue
    private Long ticketId;
    private String nomVoyageur;
    private String lieuDepart;
    private Boolean statut;
    private String lieuArrive;
    private Date dateJour;
    private String nomAgence;
    private Double montant;


    public Ticket(String nomVoyageur, String lieuDepart, Boolean statut, String lieuArrive, Date dateJour, String nomAgence, Double montant) {
        this.nomVoyageur = nomVoyageur;
        this.lieuDepart = lieuDepart;
        this.statut = statut;
        this.lieuArrive = lieuArrive;
        this.dateJour = dateJour;
        this.nomAgence = nomAgence;
        this.montant = montant;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getNomVoyageur() {
        return nomVoyageur;
    }

    public void setNomVoyageur(String nomVoyageur) {
        this.nomVoyageur = nomVoyageur;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public void setLieuDepart(String lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    public Boolean getStatut() {
        return statut;
    }

    public void setStatut(Boolean statut) {
        this.statut = statut;
    }

    public String getLieuArrive() {
        return lieuArrive;
    }

    public void setLieuArrive(String lieuArrive) {
        this.lieuArrive = lieuArrive;
    }

    public Date getDateJour() {
        return dateJour;
    }

    public void setDateJour(Date dateJour) {
        this.dateJour = dateJour;
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }
}
