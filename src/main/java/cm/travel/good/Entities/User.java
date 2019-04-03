package cm.travel.good.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long userId;
    private String userName;
    private String userFirstName;
    private String userCni;
    private String userPhone;
    private String pseudo;
    private String userPassword;
    private  String userSexe;
    private String userPhoto;
    private String userEmail;
    @OneToMany(mappedBy = "user")
private List<Comment> comments;
    @OneToMany
    private List<Reserve> reserves;

    public User(String userName, String userFirstName, String userCni, String userPhone, String pseudo, String userPassword, String userSexe, String userPhoto, String userEmail) {
        this.userName = userName;
        this.userFirstName = userFirstName;
        this.userCni = userCni;
        this.userPhone = userPhone;
        this.pseudo = pseudo;
        this.userPassword = userPassword;
        this.userSexe = userSexe;
        this.userPhoto = userPhoto;
        this.userEmail = userEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserCni() {
        return userCni;
    }

    public void setUserCni(String userCni) {
        this.userCni = userCni;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSexe() {
        return userSexe;
    }

    public void setUserSexe(String userSexe) {
        this.userSexe = userSexe;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Reserve> getReserves() {
        return reserves;
    }

    public void setReserves(List<Reserve> reserves) {
        this.reserves = reserves;
    }
}
