package com.example.demo.Student;

import lombok.Data;

import java.time.LocalDate;

public class Student {

    private Long id;
    private String email;
    private String name;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(Long id, String email, String name, LocalDate dob, Integer age) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.dob = dob;
        this.age = age;
    }

    public Student(String email, String name, LocalDate dob, Integer age) {
        this.email = email;
        this.name = name;
        this.dob = dob;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
