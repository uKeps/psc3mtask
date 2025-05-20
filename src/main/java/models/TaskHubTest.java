package models;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TaskHubTest {
    private static EntityManagerFactory emf;
    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("PU");

        EntityManager em = emf.createEntityManager();

        try {
            // Criar Usuarios
            Usuario usuario1 = new Usuario("Foden","foden@gmail.com","123456",1);
            Usuario usuario2 = new Usuario("Vasco","vasco@gmail.com","123456",2);

            // Persistir Usuarios
            em.getTransaction().begin();
            em.persist(usuario1);
            em.persist(usuario2);
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }
    }
}
