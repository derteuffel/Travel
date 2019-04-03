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
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private Long postId;
    private  String titre;
    private String userName;
    private Date datePublication;
    private  String description;
    private int like;
    private String userPhoto;
    private List<String> fichiers;


    public Post(String titre, Date datePublication, String userName, String description, int like, String userPhoto, List<String> fichiers) {
        this.titre = titre;
        this.datePublication = datePublication;
        this.userName = userName;
        this.description = description;
        this.like = like;
        this.userPhoto = userPhoto;
        this.fichiers = fichiers;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public List<String> getFichiers() {
        return fichiers;
    }

    public void setFichiers(List<String> fichiers) {
        this.fichiers = fichiers;
    }
}
