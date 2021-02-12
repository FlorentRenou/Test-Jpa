import entite.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-essai");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //CREATE
        //Livre livre = new Livre(6,"TitreTest","AuteurTest");
        //em.persist(livre);

        //READ
        //Livre l = em.find(Livre.class,5);
        //System.out.println(l);

        //UPDATE
        //l.setTitre("UpdateTitre");

        Livre livre = new Livre(10,"TitreTest","AuteurTest");
        em.persist(livre);

        Livre l = em.find(Livre.class,5);
        System.out.println(l.toString());

        l.setTitre("Du plaisir dans la cuisine");

        TypedQuery<Livre> queryTitre = em.createQuery("SELECT l FROM Livre l WHERE l.titre='" + "Germinal" + "'", Livre.class);
        System.out.println(queryTitre.getResultList().get(0));
        TypedQuery<Livre> queryAuteur = em.createQuery("SELECT l FROM Livre l WHERE l.auteur='" + "Jules Verne" + "'", Livre.class);
        System.out.println(queryAuteur.getResultList().get(0));

        em.remove(livre);

        /* Tous afficher (Fonctionne pas)
        TypedQuery<Livre> querySelect = em.createQuery("SELECT Livre.auteur,Livre.titre FROM Livre", Livre.class);
        System.out.println(querySelect.getResultList());
        querySelect.getResultList().forEach(lx -> {
            System.out.println(lx.toString());
        });*/

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
