package com.onboardiq.config;

import com.onboardiq.models.User;
import com.onboardiq.models.UserRole;
import jakarta.persistence.EntityManager;

import java.util.List;

public class DatabaseSeeder {

    public static void seed() {

        EntityManager em = HibernateConfig.getEntityManagerFactory().createEntityManager();

        em.getTransaction().begin();

        List<User> users = List.of(
                create("Thato", "Pailane", "mabuelathato03@gmail.com", UserRole.ACQUISITION_BANKER),
                create("Acq2", "Banker", "acq2@onboardiq.com", UserRole.ACQUISITION_BANKER),

                create("Tumelo", "Pailane", "thatopailane7@gmail.com", UserRole.TRANSACTIONAL_BANKER),
                create("Trans2", "Banker", "trans2@onboardiq.com", UserRole.TRANSACTIONAL_BANKER)

        );

        for (User u : users) {
            em.persist(u);
        }

        em.getTransaction().commit();
        em.close();

        System.out.println("Database seeded successfully");
    }

    private static User create(String first, String last, String email, UserRole role) {
        User u = new User();
        u.setFirstName(first);
        u.setLastName(last);
        u.setEmail(email);
        u.setPasswordHash("password");
        u.setRole(role);
        u.setDepartment("BANKING");
        u.setActive(true);
        return u;
    }
}