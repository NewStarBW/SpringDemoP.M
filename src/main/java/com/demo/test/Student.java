package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private Long id;

    private String userName;

    private int age;

    private String gender;

    /**
     * 课程字符串数组
     */
    private String[] courses = new String[0];

    /**
     * 爱好集合
     */
    private List<String> hobbyList = new ArrayList<>();

    public Student() {
    }

    public Student(Long id, String userName, int age, String gender) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public void saiHi() {
        System.out.println("老师你好，我是" + userName + "....");
    }

    @Override
    public String toString() {
        return "{" +
            "id=" + id +
            ", userName='" + userName + '\'' +
            ", age=" + age +
            ", gender='" + gender + '\'' +
            ", courses='" + Arrays.toString(courses) + '\'' +
            ", hobby='" + Arrays.toString(hobbyList.toArray()) + '\'' +
        '}';
    }
}
