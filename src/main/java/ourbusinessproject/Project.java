package ourbusinessproject;

import jakarta.validation.constraints.NotBlank;

public class Project {

    @NotBlank
    private String title;
    private String description;

    public Project(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Project() {
        this.title = "default title";
    }

    /**
     * Set the title
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
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
     *
     * @return the discription
     */
    public String getDescription() {
        return description;
    }
}
