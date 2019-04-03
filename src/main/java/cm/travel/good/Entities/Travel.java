package cm.travel.good.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class Travel implements Serializable{

    @Id
    @GeneratedValue
    private Long travelId;
    private Date heureDepart;
    private String nomChauffeur;
    private String lieuDepart;
    private String destination;
    private  String bordereau;
    private Date dateVoyage;


    public Travel( String nomChauffeur, String lieuDepart, String destination, String bordereau, Date dateVoyage, Date heureDepart) {

        this.nomChauffeur = nomChauffeur;
        this.lieuDepart = lieuDepart;
        this.destination = destination;
        this.bordereau = bordereau;
        this.dateVoyage = dateVoyage;
        this.heureDepart = heureDepart;
    }


    public Long getTravelId() {
        return travelId;
    }

    public void setTravelId(Long travelId) {
        this.travelId = travelId;
    }

    public Date getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Date heureDepart) {
        this.heureDepart = heureDepart;
    }


    public String getNomChauffeur() {
        return nomChauffeur;
    }

    public void setNomChauffeur(String nomChauffeur) {
        this.nomChauffeur = nomChauffeur;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public void setLieuDepart(String lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getBordereau() {
        return bordereau;
    }

    public void setBordereau(String bordereau) {
        this.bordereau = bordereau;
    }

    public Date getDateVoyage() {
        return dateVoyage;
    }

    public void setDateVoyage(Date dateVoyage) {
        this.dateVoyage = dateVoyage;
    }
}
