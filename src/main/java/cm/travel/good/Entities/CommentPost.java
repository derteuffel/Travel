package cm.travel.good.Entities;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class CommentPost extends Comment {
    public CommentPost(String content, int like, List<String> fihiers) {
        super(content, like, fihiers);
    }
}
