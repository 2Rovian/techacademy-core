package com.techacademy.core_service.application.services;

import com.techacademy.core_service.adapters.out.repositories.StudentRepositoryImpl;
import com.techacademy.core_service.domain.student.Student;

import java.util.List;

public class StudentService {

    private final StudentRepositoryImpl studentRepository;

    public StudentService(StudentRepositoryImpl studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student registerStudent(Student student){
        return studentRepository.registerStudent(student);
    }

    public Student findStudentById(Long id) {
        return studentRepository.findStudentById(id);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAllStudents();
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteStudentById(id);
    }
}
