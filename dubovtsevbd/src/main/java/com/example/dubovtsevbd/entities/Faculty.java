package com.example.dubovtsevbd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "faculty")
public class Faculty implements Serializable {

    @Id
    @Column(name = "id_faculty")
    private Long id_faculty;

    private String name_faculty;

    @JsonIgnore
    @OneToMany(mappedBy = "faculty")
    private Collection<Faculty> faculty;

    public Faculty() {}

    public Long getId_faculty() {
        return id_faculty;
    }

    public String getName_faculty() {
        return name_faculty;
    }

    public Collection<Faculty> getFaculty() {
        return faculty;
    }

    public void setId_faculty(Long id_faculty) {
        this.id_faculty = id_faculty;
    }

    public void setName_faculty(String name_faculty) {
        this.name_faculty = name_faculty;
    }

    public void setFaculty(Collection<Faculty> faculty) {
        this.faculty = faculty;
    }
}
