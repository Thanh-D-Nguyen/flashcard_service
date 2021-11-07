package com.app.Flashcard.service;

import com.app.Flashcard.entity.Example;
import com.app.Flashcard.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {
    @Autowired
    private ExampleRepository repository;

    public List<Example> getExamples() {
        return repository.findAll();
    }
}
