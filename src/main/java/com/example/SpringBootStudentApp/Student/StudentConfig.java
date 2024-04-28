package com.example.SpringBootStudentApp.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student enock = new Student(
                    "Enock",
                    "enock@yahoo.fr",
                    LocalDate.of(1996, Month.SEPTEMBER, 12)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@yahoo.fr",
                    LocalDate.of(2001, Month.AUGUST, 20)
            );

            repository.saveAll(
                    List.of(enock, alex)
            );
        };
    }
}
