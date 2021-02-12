package entite;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Client implements Serializable {

    @Id
    private int id;
    private String nom;
    private String prenom;

    public Client() {
    }

    public Client(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return nom;
    }

    public void setTitre(String nom) {
        this.nom = nom;
    }

    public String getAuteur() {
        return prenom;
    }

    public void setAuteur(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
