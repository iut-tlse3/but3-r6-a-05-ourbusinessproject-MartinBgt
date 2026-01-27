package ourbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Project {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;
    private String description;
    @ManyToOne @NotNull
    private Enterprise enterprise;

    public Project(String title, String description, Enterprise enterprise) {
        this.title = title;
        this.description = description;
        this.enterprise = enterprise;
    }

    public Project() {
        this.title = "default title";
    }

    /**
     * Set enterprise of project
     * @param enterprise
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     * Set the title
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get title
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get description
     * @return the discription
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get id of a project
     * @return id of project
     */
    public Long getId() {
        return id;
    }

    /**
     * set id of a project
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
}
