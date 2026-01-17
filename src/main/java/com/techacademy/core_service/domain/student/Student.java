package com.techacademy.core_service.domain.student;

public class Student {
    private Long id;
    private String name;
    private Long classroomId;
    private String registrationString;

    public Student(){
    }

    public Student(Long id, String name, Long classroomId, String registrationString) {
        this.id = id;
        this.name = name;
        this.classroomId = classroomId;
        this.registrationString = registrationString;
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

    public String getRegistrationString() {
        return registrationString;
    }

    public void setRegistrationString(String registrationString) {
        this.registrationString = registrationString;
    }
}
