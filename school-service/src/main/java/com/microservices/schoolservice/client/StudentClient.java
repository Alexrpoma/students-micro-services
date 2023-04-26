package com.microservices.schoolservice.client;

import com.microservices.schoolservice.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {

  @GetMapping("/school/{schoolId}")
  List<Student> findAllStudentsBySchool(@PathVariable("schoolId") UUID id);

}
