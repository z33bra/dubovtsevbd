package com.example.dubovtsevbd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @Column(name = "id_student")
    private Long id_student;
    private String name_student;
    private Date enrolldate_student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_faculty")
    private Faculty faculty;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_speciality")
    private Speciality speciality;

    private Long course_student;
    private Long groupnumber_student;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private Collection<Student> student;

    public Student() {}

    public Long getId_student() {
        return id_student;
    }

    public String getName_student() {
        return name_student;
    }

    public Date getEnrolldate_student() {
        return enrolldate_student;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public Long getCourse_student() {
        return course_student;
    }

    public Long getGroupnumber_student() {
        return groupnumber_student;
    }

    public Collection<Student> getStudent() {
        return student;
    }

    public void setId_student(Long id_student) {
        this.id_student = id_student;
    }

    public void setName_student(String name_student) {
        this.name_student = name_student;
    }

    public void setEnrolldate_student(Date enrolldate_student) {
        this.enrolldate_student = enrolldate_student;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public void setCourse_student(Long course_student) {
        this.course_student = course_student;
    }

    public void setGroupnumber_student(Long groupnumber_student) {
        this.groupnumber_student = groupnumber_student;
    }

    public void setStudent(Collection<Student> student) {
        this.student = student;
    }
}
