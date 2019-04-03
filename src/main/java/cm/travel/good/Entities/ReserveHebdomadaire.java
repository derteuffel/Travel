package cm.travel.good.Entities;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by derteuffel on 03/04/2019.
 */
@Entity
public class ReserveHebdomadaire extends Reserve {
    public ReserveHebdomadaire(Double prix, String periode, Date dateReservation, Boolean statut) {
        super(prix, periode, dateReservation, statut);
    }
}
