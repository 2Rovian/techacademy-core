package com.techacademy.core_service.adapters.out.repositories;

import com.techacademy.core_service.adapters.out.entities.JpaStudentEntity;
import com.techacademy.core_service.domain.student.Student;
import com.techacademy.core_service.domain.student.StudentRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentRepositoryImpl implements StudentRepository {

    private final JpaStudentRepository jpaStudentRepository;

    public StudentRepositoryImpl(JpaStudentRepository jpaStudentRepository) {
        this.jpaStudentRepository = jpaStudentRepository;
    }

    @Override
    public Student registerStudent(Student student) {
        JpaStudentEntity jpaStudent = new JpaStudentEntity(student);
        jpaStudentRepository.save(jpaStudent);
        return new Student(jpaStudent.getId(), jpaStudent.getName(), jpaStudent.getClassroomId(), jpaStudent.getRegistration());
    }

    @Override
    public Student findStudentById(Long id) {
        Optional<JpaStudentEntity> jpaStudent = jpaStudentRepository.findById(id);
        return jpaStudent.map(student -> new Student(
                student.getId(),
                student.getName(),
                student.getClassroomId(),
                student.getRegistration()))
                .orElse(null);
    }

    @Override
    public List<Student> findAllStudents() {
        List<JpaStudentEntity> jpaStudentEntities = jpaStudentRepository.findAll();
        return jpaStudentEntities.stream().map(student -> new Student(
                        student.getId(),
                        student.getName(),
                        student.getClassroomId(),
                        student.getRegistration()))
                    .collect(Collectors.toList());
    }

    @Override
    public void deleteStudentById(Long id) {
        jpaStudentRepository.deleteById(id);
    }
}
