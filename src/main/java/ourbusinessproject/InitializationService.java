package ourbusinessproject;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  This service is responsible for initializing the project data.
 */
@Service
public class InitializationService {

    private Enterprise e1;
    private Enterprise e2;
    private Project p1;
    private Project p2;
    private Project p3;

    /**
     * This method initializes the project data.
     */
    @Autowired
    private EnterpriseProjectService enterpriseProjectService;

    /**
     * Initialization of the initial list of projects
     */
    @Transactional
    public void initProjects() {
        initEnterprise();
        p1 = enterpriseProjectService.newProject("t1", "d1 description", e1);
        p2 = enterpriseProjectService.newProject("t2", "d2 description", e2);
        p3 = enterpriseProjectService.newProject("t3", "d3 description", e1);
    }

    private void initEnterprise() {
        e1 = enterpriseProjectService.newEnterprise("n1","My comp1 description","cN1","comp1@com.com");
        e2 = enterpriseProjectService.newEnterprise("n2","My comp2 description","cN2","comp2@com.com");
    }

    /**
     * @return the p1
     */
    public Project getProject1E1() {
        return p1;
    }

    /**
     * @return the p2
     */
    public Project getProject1E2() {
        return p2;
    }

    /**
     * @return the p3
     */
    public Project getProject2E1() {
        return p3;
    }

    /**
     * @return the e1
     */
    public Enterprise getEnterprise1() {
        return e1;
    }

    /**
     * @return the e2
     */
    public Enterprise getEnterprise2() {
        return e2;
    }


}
