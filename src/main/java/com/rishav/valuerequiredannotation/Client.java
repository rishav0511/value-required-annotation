package com.rishav.valuerequiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/rishav/valuerequiredannotation/beans.xml");
        Student student = context.getBean("student",Student.class);
        student.displayStudentInfo();
    }
}
