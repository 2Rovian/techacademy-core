package com.techacademy.core_service.adapters.in.controllers;

import com.techacademy.core_service.adapters.out.entities.JpaClassroomEntity;
import com.techacademy.core_service.application.services.ClassroomService;
import com.techacademy.core_service.domain.classroom.Classroom;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/classroom")
public class ClassroomController {
    private final ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @GetMapping
    public ResponseEntity<Optional<Classroom>> getClassroomById(@PathVariable Long id) {
        return ResponseEntity.ok(classroomService.findClassroomById(id));
    }

    @GetMapping
    public ResponseEntity<List<Classroom>> getAllClassroom() {
        return ResponseEntity.ok(classroomService.findAllClassrooms());
    }

    @PostMapping
    public ResponseEntity<Classroom> postClassroom(@RequestBody Classroom classroom) {
        return ResponseEntity.ok(classroomService.registerClassroom(classroom));
    }

    @DeleteMapping
    public void deleteClassroom(@PathVariable Long id) {
        classroomService.deleteClassroomById(id);
    }
}