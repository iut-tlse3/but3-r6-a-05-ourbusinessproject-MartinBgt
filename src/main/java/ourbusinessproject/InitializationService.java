package ourbusinessproject;

import jakarta.persistence.EntityManager;
import org.hibernate.query.sql.spi.ParameterOccurrence;

public class InitializationService {

    private EntityManager entityManager2;

    private Enterprise e1;
    private Enterprise e2;

    private Project p1;
    private Project p2;
    private Project p3;


    public void initProjects() {
        e1 = new Enterprise();
        e1.setName("n1");
        e1.setDescription("enterpriseD1");
        e1.setContactName("cN1");
        e1.setContactEmail("cE1");
        p1 = new Project("t1", "d1", e1);

        e2 = new Enterprise();
        e2.setName("n2");
        e2.setDescription("enterpriseD2");
        e2.setContactName("cN2");
        e2.setContactEmail("cE2");
        p2 = new Project("t2", "d2", e2);

        p3 = new Project("t3", "d3", e1);

        entityManager2.persist(p1);
        entityManager2.persist(p2);
        entityManager2.persist(p3);
        entityManager2.flush();
        e1.addProjects(p1);
        e1.addProjects(p2);
        e1.addProjects(p3);
    }

    public EntityManager getEntityManager2() {
        return entityManager2;
    }

    public Project getProject1E1() {
        return p1;
    }

    public Project getProject1E2() {
        return p2;
    }

    public Project getProject2E1() {
        return p3;
    }

    public Enterprise getEnterprise1() {
        return e1;
    }

    public Enterprise getEnterprise2() {
        return e2;
    }


}
