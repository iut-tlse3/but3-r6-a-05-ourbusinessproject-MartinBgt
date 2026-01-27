package ourbusinessproject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Enterprise {

    @NotBlank
    private String name;
    @Size(min=10)
    private String description;
    @NotBlank
    private String contactName;
    @NotBlank
    @Email
    private String contactEmail;

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * set the description
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * set the contactName
     * @param cntactName
     */
    public void setContactName(String cntactName) {
        this.contactName = cntactName;
    }

    /**
     *
     * @return contactEmail
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Set the contactEmail
     * @param contactEmail
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
