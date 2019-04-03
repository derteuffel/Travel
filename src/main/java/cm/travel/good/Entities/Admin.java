package cm.travel.good.Entities;

import javax.persistence.Entity;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class Admin extends User{
    private String cv;

    public Admin(String cv, String userName, String userFirstName, String userCni, String userPhone, String pseudo, String userPassword, String userSexe, String userPhoto, String userEmail) {
        super(userName, userFirstName, userCni, userPhone, pseudo, userPassword, userSexe, userPhoto, userEmail);
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}
