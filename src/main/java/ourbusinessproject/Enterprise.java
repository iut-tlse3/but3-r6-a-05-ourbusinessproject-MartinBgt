package ourbusinessproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Enterprise {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String name;
    @Size(min=10)
    private String description;
    @NotBlank
    private String contactName;
    @NotBlank @Email
    private String contactEmail;

    /**
     * Get the name of the enterprise
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
     * Get id of an enterprise
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * set id of an enterprise
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the description of the enterprise
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
     * get the contact name of the enterprise
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
     * get the contact email
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
