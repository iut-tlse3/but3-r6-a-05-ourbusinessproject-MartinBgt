package ourbusinessproject;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseProjectService {

    private final EntityManager entityManager;

    public EnterpriseProjectService (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public Project newProject(String title, String description){
        Project project = new Project(title, description);
        entityManager.persist(project);
        entityManager.flush();
        return project;
    }

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

    public Project findProjectById(Long anId) {
        return entityManager.find(Project.class, anId);
    }

    public Enterprise findEnterpriseById(Long anId) {
        return entityManager.find(Enterprise.class, anId);
    }

}
