package cm.travel.good.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class Representation implements Serializable{

    @Id
    @GeneratedValue
    private Long representationId;
    private  String nomRepresentation;
    private String region;
    private String quartier;


    public Representation(String nomRepresentation, String region, String quartier) {
        this.nomRepresentation = nomRepresentation;
        this.region = region;
        this.quartier = quartier;
    }

    public Long getRepresentationId() {
        return representationId;
    }

    public void setRepresentationId(Long representationId) {
        this.representationId = representationId;
    }

    public String getNomRepresentation() {
        return nomRepresentation;
    }

    public void setNomRepresentation(String nomRepresentation) {
        this.nomRepresentation = nomRepresentation;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }
}
