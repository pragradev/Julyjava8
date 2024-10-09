package io.pragra.learning.service;

import io.pragra.learning.Student;
import io.pragra.learning.StudentRepository;

import java.util.Objects;
import java.util.Optional;

public class StudentService {

    public void fetchStudents(){

        StudentRepository repository = new StudentRepository();

        Optional<Student> opStudent = repository.getStudentById();

        try {
            Student student = opStudent.orElseThrow(() -> new RuntimeException("Student not found"));
            System.out.println(student);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }


        // print firstname

//        if (opStudent.isPresent()){
//            Student student = opStudent.get();
//            System.out.println(student.getFirstName());
//        }



    }

}
