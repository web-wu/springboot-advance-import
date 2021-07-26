package com.tabwu.testmysprringbootstarter;

import com.tabwu.myspringbootautoconfiguration.annotation.AutoAnno;
import com.tabwu.myspringbootautoconfiguration.configuration.AutoConfiguration;
import com.tabwu.myspringbootautoconfiguration.entitty.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@ComponentScan("com.tabwu.myspringbootautoconfiguration.configuration")
//@Import(Student.class)
//@Import(AutoConfiguration.class)
//@Import(AutoAnno.class)
public class TestMySprringbootStarterApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TestMySprringbootStarterApplication.class, args);


        Student student1 = new Student();

        Student student = context.getBean(Student.class);

        System.out.println(student);


    }

}
