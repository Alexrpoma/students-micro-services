package com.microservice.studentservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

  public List<Student> findAllStudentsBySchool(UUID id) {
    return studentRepository.findAllBySchoolId(id);
  }
}
