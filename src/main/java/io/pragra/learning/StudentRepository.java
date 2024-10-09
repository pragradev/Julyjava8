package io.pragra.learning;

import lombok.Builder;

import java.util.Optional;

public class StudentRepository {
    public Optional<Student> getStudentById(){
        // connecting to database and fetching student -> 1221
//        Student student = Student.builder().firstName("James").lastName("Potter").build();
//        Optional<Student> optionalStudent = Optional.ofNullable(student);
        Optional<Student> optionalStudent = Optional.empty();
        return optionalStudent;
    }
}
