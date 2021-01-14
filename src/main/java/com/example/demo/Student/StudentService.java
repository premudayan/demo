package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

// the below annotation can be a component or service
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail =  studentRepository.findStudentByEmail(student.getEmail());
        if ( studentByEmail.isPresent() ) {
            throw new IllegalStateException("Email taken !");
        }
        studentRepository.save(student);

    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if ( !exists ) {
            throw new IllegalStateException("Student with Id " + studentId + " does not exist !");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email) {

        System.out.println("Test ----  1");

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException(
                        "Student with id "+ studentId + " does not exist !"
                ));
        System.out.println("Test ----  2");

        if ( name != null && name.trim().length() > 0 && !Objects.equals(student.getName(), name ) ) {
            student.setName(name);
        }

        System.out.println("Test ----  3");
        if ( email != null && email.trim().length() > 0 && !Objects.equals(student.getEmail(), email ) ) {

            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
            if ( studentOptional.isPresent()) {
                throw new IllegalStateException("Email Taken !");
            }
            student.setEmail(email);
        }
        System.out.println("Test ----  4");

    }
}
