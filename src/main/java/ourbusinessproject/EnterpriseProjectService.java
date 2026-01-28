package ourbusinessproject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseProjectService {

    private final EntityManager entityManager;

    public EnterpriseProjectService (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     *
     * @return entityManager
     */
    public EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * Set a project in entityManager and adding the project to the enterprise
     * @param title
     * @param description
     * @param enterprise
     * @return project in the entityManager
     */
    public Project newProject(String title, String description, Enterprise enterprise){
        Project project = new Project(title, description, enterprise);
        entityManager.persist(project);
        entityManager.flush();
        enterprise.addProjects(project);
        return project;
    }

    /**
     * Set a enterprise in entityManager
     * @param name
     * @param description
     * @param contactName
     * @param contactEmail
     * @return enterprise in the entityManager
     */
    public Enterprise newEnterprise(String name,
                                    String description,
                                    String contactName,
                                    String contactEmail)
    {
        Enterprise enterprise = new Enterprise();
        enterprise.setName(name);
        enterprise.setDescription(description);
        enterprise.setContactName(contactName);
        enterprise.setContactEmail(contactEmail);
        entityManager.persist(enterprise);
        entityManager.flush();
        return enterprise;
    }

    /**
     * Find project by his Id
     * @param anId
     * @return project
     */
    public Project findProjectById(Long anId) {
        return entityManager.find(Project.class, anId);
    }

    /**
     * Find enterprise by his Id
     * @param anId
     * @return enterprise
     */
    public Enterprise findEnterpriseById(Long anId) {
        return entityManager.find(Enterprise.class, anId);
    }

    /**
     * Renvoie tous les projects de la bd.
     * @return all projects
     */
    public List<Project> findAllProjects() {
        String query = "SELECT p FROM Project p ORDER BY p.title";
        TypedQuery<Project> queryObj = entityManager.createQuery(query,Project.class);
        return queryObj.getResultList();
    }
}
