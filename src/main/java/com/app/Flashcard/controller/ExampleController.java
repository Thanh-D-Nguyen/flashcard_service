package com.app.Flashcard.controller;

import com.app.Flashcard.entity.Example;
import com.app.Flashcard.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExampleController {
    @Autowired
    private ExampleService service;

    @GetMapping("/examples")
    public List<Example> findExamples() {
        return service.getExamples();
    }

    @GetMapping("/saveAllExamples")
    public void loadAllExamples() {

    }

}
