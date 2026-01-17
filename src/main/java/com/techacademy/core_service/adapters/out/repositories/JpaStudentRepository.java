package com.techacademy.core_service.adapters.out.repositories;

import com.techacademy.core_service.adapters.out.entities.JpaStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaStudentRepository extends JpaRepository<JpaStudentEntity, Long> {
    List<JpaStudentEntity> findByClassroomId(Long id);
}
