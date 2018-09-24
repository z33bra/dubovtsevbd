package com.example.dubovtsevbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "marks")
public class Marks implements Serializable {

    @Id
    @Column(name = "id_marks")
    private Long id_marks;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_student")
    private Student student;

    private Long semester;
    private String name_subject;
    private Long mark;
    private Date date_exam;
    private String surname_teacher;

    public Marks() {}

    public Long getId_marks() {
        return id_marks;
    }

    public Student getStudent() {
        return student;
    }

    public Long getSemester() {
        return semester;
    }

    public String getName_subject() {
        return name_subject;
    }

    public Long getMark() {
        return mark;
    }

    public Date getDate_exam() {
        return date_exam;
    }

    public String getSurname_teacher() {
        return surname_teacher;
    }

    public void setId_marks(Long id_marks) {
        this.id_marks = id_marks;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setSemester(Long semester) {
        this.semester = semester;
    }

    public void setName_subject(String name_subject) {
        this.name_subject = name_subject;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }

    public void setDate_exam(Date date_exam) {
        this.date_exam = date_exam;
    }

    public void setSurname_teacher(String surname_teacher) {
        this.surname_teacher = surname_teacher;
    }
}
