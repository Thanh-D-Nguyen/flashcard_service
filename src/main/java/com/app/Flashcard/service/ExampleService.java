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
public class ExampleService {
    @Autowired
    private ExampleRepository repository;

    public List<Example> getExamples() {
        return repository.findAll();
    }
}
