package ourbusinessproject;

import jakarta.annotation.PostConstruct;

public class Bootstrap {

    private InitializationService initializationService;

    public Bootstrap(InitializationService initializationService) {
        this.initializationService = initializationService;
    }

    @PostConstruct
    public void init() {
        this.initializationService.initProjects();
    }

    public InitializationService getInitializationService() {
        return this.initializationService;
    }
}
