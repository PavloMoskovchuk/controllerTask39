package com.example.controllertask39.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Student {
    private String FirstName;
    private String LastName;
    private int Age;

}

