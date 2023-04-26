package com.microservices.schoolservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

  private final SchoolRepository  schoolRepository;

  public void createSchool(School school) {
    schoolRepository.save(school);
  }

  public List<School> getAllSchool() {
    return schoolRepository.findAll();
  }
}
