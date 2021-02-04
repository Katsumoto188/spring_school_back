package com.rpv.school.controller;

import com.rpv.school.service.StudentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")

public class StudentsController {
    private final StudentsService studentsService;
}
