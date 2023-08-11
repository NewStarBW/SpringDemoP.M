package com.demo.test;

public class Teacher {

    private Integer id;

    private String name;

    private Student student;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void saiHi() {
        System.out.println("同学[" + student.getUserName() + "]，你好!我是:" + getName());
    }
}
