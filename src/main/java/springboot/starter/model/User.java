package springboot.starter.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    @Column(name = "profileName")
    private String profileName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
}
