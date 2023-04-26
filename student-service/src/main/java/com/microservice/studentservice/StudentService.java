package com.microservice.studentservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;

  public void createStudent(Student student) {
    studentRepository.save(student);
  }

  public List<Student> findAllStudents() {
    return studentRepository.findAll();
  }

}
