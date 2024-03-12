package com.management.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
