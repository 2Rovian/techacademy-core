package com.techacademy.core_service.adapters.in.controllers;

import com.techacademy.core_service.application.services.StudentService;
import com.techacademy.core_service.domain.student.Student;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentService.findAllStudents());
    }

    @GetMapping(path = "/id")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.findStudentById(id));
    }

    @PostMapping
    public ResponseEntity<Student> postStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.registerStudent(student));
    }

    @DeleteMapping
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
