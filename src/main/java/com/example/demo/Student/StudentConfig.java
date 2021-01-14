package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repo) {
        return args -> {
            Student prem = new Student(
                    "prem@hotmail.com",
                    "Prem",
                    LocalDate.of(2000, Month.APRIL, 10),
                    30
            );

            Student pranav = new Student(
                    "pranav@hotmail.com",
                    "Pranav Prem",
                    LocalDate.of(2006, Month.JANUARY, 18),
                    14
            );

            Student sindu = new Student(
                    "sindu@hotmail.com",
                    "Sinduja Prem",
                    LocalDate.of(1970, Month.JANUARY, 21),
                    50
            );
            repo.saveAll( List.of(prem, pranav, sindu));
        };
    }
}
