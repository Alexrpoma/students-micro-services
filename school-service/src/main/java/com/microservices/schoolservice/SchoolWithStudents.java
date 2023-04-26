package com.microservices.schoolservice;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SchoolWithStudents {

  private String name;
  private String email;
  private List<Student> students;

}
