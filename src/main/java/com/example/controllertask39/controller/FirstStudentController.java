package com.example.controllertask39.controller;

import com.example.controllertask39.domain.Student;
import com.example.controllertask39.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/students")
@RequiredArgsConstructor
public class FirstStudentController {

    private final StudentService studentServise;

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentServise.findAll();
    }

}
