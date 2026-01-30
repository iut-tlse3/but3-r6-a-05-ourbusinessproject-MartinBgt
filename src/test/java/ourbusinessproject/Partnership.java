package ourbusinessproject;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class Partnership {

    @NotNull
    private Date date;
    @NotNull
    private Enterprise enterprise;
    @NotNull
    private Project project;

    /**
     * set la date du partnership
     * @param date
     */
    public void setCreationDate(Date date) {
        this.date = date;
    }

    /**
     * Set l'entreprise
     * @param enterprise
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * Set le projet associé
     * @param project
     */
    public void setProject(Project project) {
        this.project = project;
    }
}
