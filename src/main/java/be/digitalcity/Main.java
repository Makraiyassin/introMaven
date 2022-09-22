package be.digitalcity;

import be.digitalcity.models.Person;

import javax.persistence.*;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("introMaven");
        EntityManager em = emf.createEntityManager();

//        Query query =   em.createQuery("SElECT p FROM Person p");

    }
}
