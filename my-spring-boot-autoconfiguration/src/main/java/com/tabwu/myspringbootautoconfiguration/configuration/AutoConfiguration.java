package com.tabwu.myspringbootautoconfiguration.configuration;

import com.tabwu.myspringbootautoconfiguration.beanProperties.StudentProperties;
import com.tabwu.myspringbootautoconfiguration.entitty.Student;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Student.class)
@EnableConfigurationProperties(StudentProperties.class)
public class AutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(Student.class)
    public Student student(StudentProperties stuPro) {
        return new Student(stuPro.getName(),stuPro.getAge(),stuPro.getGender());
    }
}
