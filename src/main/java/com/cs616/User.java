package com.cs616;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ian on 15-10-02.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = true)
    private String imageUrl;

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UserType userType;

    @OneToMany(mappedBy = "assignedTo")
    private List<Defect> assigned;

    @OneToMany(mappedBy = "createdBy")
    private List<Defect> created;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<Defect> getAssigned() {
        return assigned;
    }

    public void setAssigned(List<Defect> assigned) {
        this.assigned = assigned;
    }

    public List<Defect> getCreated() {
        return created;
    }

    public void setCreated(List<Defect> created) {
        this.created = created;
    }
}
