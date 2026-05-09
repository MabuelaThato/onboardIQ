package com.onboardiq;

import com.onboardiq.config.HibernateConfig;
import jakarta.persistence.EntityManager;

public class Main {

    public static void main(String[] args) {

        EntityManager em = HibernateConfig.getEntityManagerFactory().createEntityManager();

        em.getTransaction().begin();

        System.out.println("Hibernate is working!");

        em.getTransaction().commit();
        em.close();
    }
}