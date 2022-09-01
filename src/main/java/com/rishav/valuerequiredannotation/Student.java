package com.rishav.valuerequiredannotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    @Value("${student.name}")
    private String name;

    @Value("${student.course}")
    private String course;

    @Value("${student.hobby}")
    private String hobby;


    public void displayStudentInfo() {
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
        System.out.println("Hobby: "+hobby);
    }
}
