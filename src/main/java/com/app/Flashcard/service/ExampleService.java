package com.app.Flashcard.service;

import com.app.Flashcard.entity.Example;
import com.app.Flashcard.entity.Grammar;
import com.app.Flashcard.repository.ExampleRepository;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class ExampleService extends LoadJsonFileService {
    @Autowired
    private ExampleRepository repository;

    public List<Example> getExamples() {
        return repository.findAll();
    }

    public void insertAllExample() {
        if (repository.findAll().isEmpty() == false) { return; }
        // Load from json
        List<Example> examples = loadJsonFile("Example");
        System.out.println("Start save Example " + examples.get(0));
        repository.saveAll(examples);
        System.out.println("Done save example");
    }
}
