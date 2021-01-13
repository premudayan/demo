package com.example.demo.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// the below annotation can be a component or service
@Service
public class StudentService {

    public List<Student> getStudents() {
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
