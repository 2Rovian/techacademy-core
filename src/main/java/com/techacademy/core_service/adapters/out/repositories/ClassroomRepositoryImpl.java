package com.techacademy.core_service.adapters.out.repositories;

import com.techacademy.core_service.adapters.out.entities.JpaClassroomEntity;
import com.techacademy.core_service.domain.classroom.Classroom;
import com.techacademy.core_service.domain.classroom.ClassroomRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClassroomRepositoryImpl implements ClassroomRepository {

    private final JpaClassroomRepository jpaClassroomRepository;

    public ClassroomRepositoryImpl(JpaClassroomRepository jpaClassroomRepository){
        this.jpaClassroomRepository = jpaClassroomRepository;
    }

    @Override
    public Optional<Classroom> findClassroomById(Long id) {
        Optional<JpaClassroomEntity> jpaClassroomEntity = jpaClassroomRepository.findById(id);
        return jpaClassroomEntity.map(classroom -> new Classroom(
                classroom.getId(),
                classroom.getName()
        ));
    }

    @Override
    public List<Classroom> findAllClassrooms() {
        List<JpaClassroomEntity> jpaClassroomEntities =  jpaClassroomRepository.findAll();

        return jpaClassroomEntities.stream().map(classroom -> new Classroom(
                classroom.getId(),
                classroom.getName()
        )).collect(Collectors.toList());
    }

    @Override
    public Classroom registerClassroom(Classroom classroom) {
        JpaClassroomEntity jpaClassroomEntity = new JpaClassroomEntity(classroom);
        jpaClassroomRepository.save(jpaClassroomEntity);
        return new Classroom(jpaClassroomEntity.getId(), jpaClassroomEntity.getName());
    }

    @Override
    public void deleteClassroomById(Long id) {
        jpaClassroomRepository.deleteById(id);
    }
}
