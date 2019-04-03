package cm.travel.good.Entities;

import javax.persistence.Entity;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class Personnel extends User{
    private String fonction;
    private String cv;

    public Personnel(String fonction, String cv, String userName, String userFirstName, String userCni, String userPhone, String pseudo, String userPassword, String userSexe, String userPhoto, String userEmail) {
        super(userName, userFirstName, userCni, userPhone, pseudo, userPassword, userSexe, userPhoto, userEmail);
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}
