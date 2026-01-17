package com.techacademy.core_service.domain.student;

import java.util.List;

public interface StudentRepository {
    Student registerStudent(Student student);
    Student findStudentById(Long id);
    List<Student> findAllStudents();
    void deleteStudentById(Long id);

    List<Student> findStudentsByClassroomId(Long id);
}
