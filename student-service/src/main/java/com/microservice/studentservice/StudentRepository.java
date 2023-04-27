package com.microservice.studentservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {


  /**
   * Find all students by school id.
   * JPQL is not necessary here, but it is used to show how to use it.
   * Spring jpa will automatically generate the query for us depending on the method name.
   * For example, findAllBySchoolId will generate the query to find all students by school id.
   * @param id school id
   * @return list of students
   */
  @Query("SELECT s FROM Student s WHERE s.schoolId = ?1")// JPQL query to find all students by school id
  List<Student> findAllBySchoolId(UUID id);
}