package com.demo.test;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ZhuJieTeacher {

    private Integer Id;

    private String name;

    @Resource
    private ZhuJieStudent student;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZhuJieStudent getStudent() {
        return student;
    }

    public void setStudent(ZhuJieStudent student) {
        this.student = student;
    }

    public void saiHi() {
        System.out.println("同学[" + student.getUserName() + "]，你好!我是:" + getName());
    }
}
