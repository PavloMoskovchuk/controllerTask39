package com.example.controllertask39.service;

import com.example.controllertask39.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> findAll() {
        return List.of(
                new Student("Taras", "Shevchenko", 21),
                new Student("Lesia", "Kosach", 25),
                new Student("Volodymir", "Velykiy", 20)
        );
    }
}
