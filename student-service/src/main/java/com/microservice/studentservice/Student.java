package com.microservice.studentservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Student {

  @Id
  @GeneratedValue(strategy = AUTO)
  private UUID id;
  private String firstName;
  private String lastName;
  private String email;
  private UUID schoolId;
}
