package com.example.dubovtsevbd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "speciality")
public class Speciality implements Serializable {

    @Id
    @Column(name = "id_speciality")
    private Long id_speciality;

    private String name_speciality;

    @JsonIgnore
    @OneToMany(mappedBy = "speciality")
    private Collection<Speciality> speciality;

    public Speciality() {}

    public Long getId_speciality() {
        return id_speciality;
    }

    public String getName_speciality() {
        return name_speciality;
    }

    public Collection<Speciality> getSpeciality() {
        return speciality;
    }

    public void setId_speciality(Long id_speciality) {
        this.id_speciality = id_speciality;
    }

    public void setName_speciality(String name_speciality) {
        this.name_speciality = name_speciality;
    }

    public void setSpeciality(Collection<Speciality> speciality) {
        this.speciality = speciality;
    }
}
