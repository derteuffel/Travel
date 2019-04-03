package cm.travel.good.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class Agence implements Serializable {

    @Id
    @GeneratedValue
    private Long agenceId;
    private String nomAgence;
    private String localisation;


    public Agence(String nomAgence, String localisation) {
        this.nomAgence = nomAgence;
        this.localisation = localisation;
    }

    public Long getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(Long agenceId) {
        this.agenceId = agenceId;
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
}
