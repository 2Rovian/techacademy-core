package com.techacademy.core_service.adapters.out.entities;

import com.techacademy.core_service.domain.classroom.Classroom;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_classrooms")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaClassroomEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public JpaClassroomEntity(Classroom classroom){
        this.id = classroom.getId();
        this.name = classroom.getName();
    }
}
