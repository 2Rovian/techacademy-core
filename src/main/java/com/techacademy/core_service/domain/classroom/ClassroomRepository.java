package com.techacademy.core_service.domain.classroom;
import java.util.List;
import java.util.Optional;

public interface ClassroomRepository {
    Optional<Classroom> findClassroomById(Long id);
    List<Classroom> findAllClassrooms();
    Classroom registerClassroom(Classroom classroom);
    void deleteClassroomById(Long id);
}
