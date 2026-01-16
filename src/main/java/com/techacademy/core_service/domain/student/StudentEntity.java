package com.techacademy.core_service.domain.student;

public class StudentEntity {
    private Long id;
    private String name;
    private Long classroomId;
    private String registration;

    public StudentEntity(){
    }

    public StudentEntity(Long id, String name, Long classroomId, String registration) {
        this.id = id;
        this.name = name;
        this.classroomId = classroomId;
        this.registration = registration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
}
