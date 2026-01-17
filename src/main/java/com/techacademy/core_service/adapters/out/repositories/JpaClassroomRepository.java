package com.techacademy.core_service.adapters.out.repositories;

import com.techacademy.core_service.adapters.out.entities.JpaClassroomEntity;
import com.techacademy.core_service.domain.classroom.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaClassroomRepository extends JpaRepository<JpaClassroomEntity, Long> {
}
