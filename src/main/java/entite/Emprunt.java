package entite;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Emprunt implements Serializable {

    @Id
    private int id;
    private Date dateDebut;
    private Date delaiMax;
    private Date dateFin;

    public Emprunt() {
    }



}
