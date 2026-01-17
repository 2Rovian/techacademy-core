package com.techacademy.core_service.application.services;

import com.techacademy.core_service.adapters.out.repositories.ClassroomRepositoryImpl;
import com.techacademy.core_service.domain.classroom.Classroom;
import com.techacademy.core_service.domain.classroom.ClassroomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService {
    private final ClassroomRepository classroomRepository;

    public ClassroomService(ClassroomRepositoryImpl classroomRepository){
        this.classroomRepository = classroomRepository;
    }

    public Optional<Classroom> findClassroomById(Long id) {
        return classroomRepository.findClassroomById(id);
    }

    public List<Classroom> findAllClassrooms() {
        return classroomRepository.findAllClassrooms();
    }

    public Classroom registerClassroom(Classroom classroom) {
        return classroomRepository.registerClassroom(classroom);
    }

    public void deleteClassroomById(Long id) {
        classroomRepository.deleteClassroomById(id);
    }
}
