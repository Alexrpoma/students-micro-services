package com.microservices.schoolservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/school")
public class SchoolController {

  private final SchoolService schoolService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void createSchool(@RequestBody School school) {
    schoolService.createSchool(school);
  }

  @GetMapping
  public ResponseEntity<List<School>> getAllSchool() {
    return ResponseEntity.ok(schoolService.getAllSchool());
  }

}
