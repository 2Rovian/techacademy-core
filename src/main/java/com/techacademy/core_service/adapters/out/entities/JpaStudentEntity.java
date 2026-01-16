package com.techacademy.core_service.adapters.out.entities;

import com.techacademy.core_service.domain.student.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaStudentEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long classroomId;
    private String registration;

    public JpaStudentEntity(Student student){
        this.id = student.getId();
        this.name = student.getName();
        this.classroomId = student.getClassroomId();
        this.registration = student.getRegistration();
    }
}
