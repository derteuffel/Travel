package cm.travel.good.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class Comment implements Serializable {

    @Id
@GeneratedValue
    private Long commentId;
    private String content;
    private int like;
    private List<String> fihiers;

    public Comment(String content, int like, List<String> fihiers) {
        this.content = content;
        this.like = like;
        this.fihiers = fihiers;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public List<String> getFihiers() {
        return fihiers;
    }

    public void setFihiers(List<String> fihiers) {
        this.fihiers = fihiers;
    }
}
