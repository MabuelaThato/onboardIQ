package com.onboardiq.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateConfig {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("onboardiq-persistence");

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}