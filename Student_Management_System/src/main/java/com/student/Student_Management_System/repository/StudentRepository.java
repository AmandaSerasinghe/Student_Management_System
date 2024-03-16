package com.student.Student_Management_System.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.student.Student_Management_System.domain.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}