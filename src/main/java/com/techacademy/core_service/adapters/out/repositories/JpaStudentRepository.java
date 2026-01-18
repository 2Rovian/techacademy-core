package com.techacademy.core_service.adapters.out.repositories;

import com.techacademy.core_service.adapters.out.entities.JpaStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaStudentRepository extends JpaRepository<JpaStudentEntity, Long> {
    List<JpaStudentEntity> findByClassroomId(Long id);
}
