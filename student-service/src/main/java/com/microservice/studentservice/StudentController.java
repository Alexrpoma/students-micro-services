package com.microservice.studentservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

  private final StudentService studentService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void createStudent(@RequestBody Student student) {
    studentService.createStudent(student);
  }

  @GetMapping
  public ResponseEntity<List<Student>> getAllStudents() {
    return ResponseEntity.ok(studentService.findAllStudents());
  }

  @GetMapping("/school/{schoolId}")
  public ResponseEntity<List<Student>> getAllStudentsBySchool(@PathVariable("schoolId")UUID id) {
    return ResponseEntity.ok(studentService.findAllStudentsBySchool(id));
  }
}
