package com.example.demo;

import com.example.demo.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student( 1L,
                        "prem@hotmail.com",
                        "Prem",
                        LocalDate.of(2000, Month.APRIL, 10),
                        30
                        )
        );
    }
}
