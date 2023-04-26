package com.microservices.schoolservice;

import com.microservices.schoolservice.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SchoolService {

  private final SchoolRepository  schoolRepository;
  private final StudentClient studentClient;

  public void createSchool(School school) {
    schoolRepository.save(school);
  }

  public List<School> getAllSchool() {
    return schoolRepository.findAll();
  }

  public SchoolWithStudents findSchoolWithStudents(UUID id) {
    var school = schoolRepository.findById(id)
      .orElse(
        School.builder().name("NOT FOUND").email("NOT FOUND").build()
      );
    var students = studentClient.findAllStudentsBySchool(id); // find all students from student service
    return SchoolWithStudents.builder()
      .name(school.getName())
      .email(school.getEmail())
      .students(students)
      .build();
  }
}
